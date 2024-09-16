/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

import java.util.NoSuchElementException;

public class LinkedListOfStrings {
    private int N;          // size of list
    private Node first;     // first node of list

    // helper Node class
    private static class Node {
        private String item;
        private Node next;
    }

    public LinkedListOfStrings() {
        N = 0;
        first = null;
    }

    // is the list empty?
    public boolean isEmpty() {
        return first == null;
    }

    // number of elements on the stack
    public int size() {
        return N;
    }


    // add an element to the front of the list
    public void addFront(String item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    // delete and return the first item in the list
    public String delFront() {
        if (isEmpty()) throw new NoSuchElementException("No items in list");
        String item = first.item;      // save item to return
        first = first.next;            // delete first node
        N--;
        return item;                   // return the saved item
    }

    public String delBack() {
        if (isEmpty()) throw new NoSuchElementException("No items in list");
        int counter = N;
        String[] list = new String[counter];
        for (int i = 0; i < counter; i++) {
            list[i] = delFront();
        }
        for (int i = counter - 2; i >= 0; i--) {
            addFront(list[i]);
        }
        return list[counter - 1];


    }

    // print out the list
    public void printList() {
        Node x = first;
        for (int i = 0; i < N; i++) {
            System.out.println(x.item + " ");
            x = x.next;
        }
        System.out.println("_");//til þess að betur afmarka lista í keyrslu
    }

    // test client
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("DLS_DEAD_LOCAL_STORE")
    public static void main(String[] args) {
        LinkedListOfStrings list = new LinkedListOfStrings();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            list.addFront(item);
        }
        list.printList();

        System.out.println("Number of items: " + list.size());

        String s = list.delFront();

        list.printList();

        for (int i = 0; i < 3; i++) {
            String t = list.delBack();
            list.printList();
        }

    }

}

