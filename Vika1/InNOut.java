import java.util.Arrays;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class InNOut {
    public static void main(String[] args) {
        In inn = new In("inn.txt");
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = inn.readInt();
        }

        //inn.close();
        String t = inn.readLine();
        String s = inn.readLine();

        System.out.println(Arrays.toString(a));
        System.out.println(t + s);
        Out ut = new Out("inn.txt");
        ut.println("kukur");
    }
}
