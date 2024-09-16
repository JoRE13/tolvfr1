import java.awt.Color;

/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Forritið tekur inn vídd og fjölda ítranna af skipanalínu, miðju
 *            myndar og rgb gilda lita af skrá og býr til mynd af mandelbroti
 *
 *
 *****************************************************************************/

public class ColorBrot {

    public static int mand(Complex z0, int d) {
        Complex z = z0;
        for (int t = 0; t < d; t++) {
            if (z.abs() > 2.0) return t;
            z = z.times(z).plus(z0);
        }
        return d;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int ITERS = Integer.parseInt(args[1]);
        // read in color map

        // compute Mandelbrot set
        Picture picture = reiknaMandelBrot(lesaMidja("midja.txt"), n, ITERS,
                                           lesaColors("mandel.txt", ITERS));
        picture.show();


    }

    /**
     * <p>
     * setur gildi á miðju og stærð kassa inn í square
     * </p>
     *
     * @param skra með tveimur kommutölum, miðju, og einni heiltölu, stærð.
     * @return skilar square með gildunum úr skránni
     */
    public static Square lesaMidja(String skra) {
        In in = new In(skra);
        double cx = in.readDouble();
        double cy = in.readDouble();
        int s = in.readInt();
        Square k = new Square(cx, cy, s);
        return k;
    }

    /**
     * <p>
     * býr til fylki af litum útfrá rgb gildum í skrá
     * </p>
     *
     * @param skra    skrá með rgb gildum á litum
     * @param itranir hversu margir litir eru teknir úr skránni
     * @return fylki af litum með rgb gildum teknum úr skrá
     */
    public static Color[] lesaColors(String skra, int itranir) {
        In in = new In(skra);
        Color colors[] = new Color[itranir];
        for (int i = 0; i < itranir; i++) {
            int r = in.readInt();
            int g = in.readInt();
            int b = in.readInt();
            colors[i] = new Color(r, g, b);
        }
        return colors;
    }

    /**
     * <p>
     * teiknar mandelbrot.
     * </p>
     *
     * @param s          square með gildum á stærð og miðju kassa
     * @param n          vídd myndar
     * @param iterations fjöldi ítranna
     * @param colors     fylki með litum af skrá
     * @return skilar mynd af mandelbroti
     */
    public static Picture reiknaMandelBrot(Square s, int n, int iterations,
                                           Color[] colors) {
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                double x = s.getX0(col, n);
                double y = s.getY0(row, n);
                Complex z0 = new Complex(x, y);
                int t = mand(z0, iterations - 1);
                picture.set(col, n - 1 - row, colors[t]);
            }
        }
        return picture;

    }

}
