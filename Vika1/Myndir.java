/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Myndir {
    public static void main(String[] args) {
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 1.5);
        double p = 0.1;
        StdDraw.point(0, p);
        for (int i = 0; i < 100; i++) {
            p = 2.8 * p - 1.8 * p * p;
            System.out.println(p);
            StdDraw.point(p, i);
        }


    }
}
