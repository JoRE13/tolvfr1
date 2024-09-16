import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Dog {
    private int resource;

    public Dog() {
        resource = 0;
    }

    public int sleep() {
        resource++;
        return resource;
    }

    public int eat() {
        resource--;
        return resource;
    }

    public String toString() {
        return "" + resource;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, "UTF-8");
        int sefur = s.nextInt();
        int etur = s.nextInt();
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        for (int i = 0; i < sefur; i++) {
            d1.sleep();
            d2.eat();
        }
        for (int i = 0; i < etur; i++) {
            d1.eat();
            d2.sleep();
        }
        System.out.println(d1);
        System.out.println(d2);
    }
}
