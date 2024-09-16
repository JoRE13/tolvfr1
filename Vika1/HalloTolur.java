import java.awt.Color;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class HalloTolur {
    public static void main(String[] args) {
        double a[] = new double[401];
        for (int i = -200; i <= 200; i++) {
            a[i + 200] = Math.sin((double) i / 16
            );
        }
        StdDraw.setPenColor(Color.RED);
        StdDraw.setPenRadius(0.3);
        StdDraw.setYscale(-2, 2);
        StdStats.plotLines(a);


    }
}

