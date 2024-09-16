import java.awt.Color;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Prof2018 {
    public static void main(String[] args) {
        //veldi(10);
        //int a[] = { 4, 3, 5, 2, 2 };
        //System.out.println(leggja(a));
        //System.out.println(aha("ahajkjahaa"+ ""));
        /*for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j < i) System.out.print("   ");
                else System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j < i) System.out.print("");
                else System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j <= 11 - i && j >= i) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 200; i++) {
            if (i % 12 == 0) System.out.println(ha(i));

            System.out.print(ha(i) + ", ");
        }
        //System.out.println(hermaKost(100));
        //Scanner s = new Scanner(System.in, "UTf-8");
        //baraSjour(s);
        int a[] = { 6, 37, 20 };
        int b[] = fletjaFylki(a);
        System.out.println(Arrays.toString(b));*/
        /*Picture p = new Picture("Tryggvi.PNG");

        Picture q = aHvolfi(p);
        p.show();
        q.show();*/
        System.out.println(sbt('s', 'b'));
    }

    public static void veldi(int n) {
        int t = 0;
        for (int i = 0; i < n; i++) {
            t += 2 * i + 1;
            System.out.println(t);
        }
    }

    public static int leggja(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) sum += a[i];
            else sum -= a[i];
        }
        return sum;
    }

    public static Boolean aha(String s) {
        if (s.substring(0, 3).equals("aha") && s.substring(s.length() - 3, s.length())
                                                .equals("aha")) return true;
        else return false;
    }

    public static String ha(int x) {
        if (x % 3 == 0 && x % 5 == 0 && x % 7 == 0) return "HæHóHí";
        if (x % 3 == 0 && x % 7 == 0) return "HæHí";
        if (x % 3 == 0 && x % 5 == 0) return "HæHó";
        if (x % 5 == 0 && x % 7 == 0) return "HóHí";
        if (x % 3 == 0) return "Hæ";
        if (x % 5 == 0) return "Hó";
        if (x % 7 == 0) return "Hí";
        return "" + x;
    }

    public static int hermaKost(int n) {
        int ten1;
        int ten2;
        int teljari = 0;
        boolean fundin = true;
        while (fundin) {
            ten1 = StdRandom.uniform(-n, n + 1);
            ten2 = StdRandom.uniform(-n, n + 1);
            System.out.println(ten1 + " " + ten2);
            teljari++;
            if (ten1 + ten2 == 0) fundin = false;


        }
        return teljari;
    }

    public static void baraSjour(Scanner s) {
        while (s.hasNext()) {
            String t = "" + s.nextInt();
            String tf[] = t.split("");
            for (int i = 0; i < tf.length; i++) {
                if (tf[i].equals("" + 7)) {
                    System.out.print(Integer.parseInt(t) + " ");
                    break;
                }
            }
        }
    }

    public static int[] fletjaFylki(int[] a) {
        int lengd = 0;
        for (int i = 0; i < a.length; i++) {
            int t = a[i];
            while (t >= 10) {
                t -= 10;
                lengd++;
            }
            lengd++;
        }
        int[] b = new int[lengd];
        int teljari = 0;
        for (int i = 0; i < a.length; i++) {
            int t = a[i];
            while (t >= 10) {
                t -= 10;
                b[teljari] = 10;
                teljari++;
            }
            b[teljari] = t;
            teljari++;
        }
        return b;
    }

    public static Picture aHvolfi(Picture p) {
        for (int i = 0; i < p.height() / 2; i++) {
            for (int j = 0; j < p.width(); j++) {
                Color uppi = p.get(i, j);
                Color nidri = p.get(p.height() - i - 1, j);
                p.set(i, j, nidri);
                p.set(p.height() - i - 1, j, uppi);
            }
        }
        return p;
    }

    public static String sbt(char a, char b) {
        if (a == b) return "jafnt";
        switch (a) {
            case 's':
                if (b == 'b') return "A";
                break;
            case 'b':
                if (b == 't') return "A";
                break;
            case 't':
                if (b == 's') return "A";
                break;
        }
        return "B";
    }
}
