import java.awt.Color;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class DropBoxLogo {
    public static void main(String[] args) {
        Color blar = new Color(0, 97, 254);
        Color hvitur = new Color(247, 245, 242);
        StdDraw.clear(blar);
        StdDraw.setXscale(-15, 115);
        StdDraw.setYscale(-15, 100);
        StdDraw.setPenColor(hvitur);
        tigull(50, 16);
        tigull(25, 37);
        tigull(75, 37);
        tigull(25, 69);
        tigull(75, 69);


    }

    /**
     * <p>
     * Teiknar tígul með miðju (x,y) með breidd 50 og hæð 32.
     * </p>
     *
     * @param x x-hnit miðju tíguls
     * @param y y-hnit miðju tíguls
     */

    public static void tigull(double x, double y) {
        double[] x1 = { x, x + 25, x, x - 25 };
        double[] y1 = { y + 16, y, y - 16, y };
        StdDraw.filledPolygon(x1, y1);
    }

    
}

