import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Tekur inn söfn af punktum (x_0,y_0) og athugar hvort punkturinn
 *            y_0 er innan marka við f(x_0) = cos(x_0)+sqrt(x_0+5). Kastar fram
 *            villuboðum ef fjöldi x_0 og y_0 er mismunandi eða ef ekki eru teknir
 *            inn x_0 eða y_0.
 *
 *
 *****************************************************************************/

public class Ferill {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, "UTF-8");
        double F = s.nextDouble();
        int n = s.nextInt();
        double x0[] = new double[n];
        double y0[] = new double[n];
        int teljari = 0;
        while (s.hasNext()) {
            x0[teljari] = s.nextDouble();
            y0[teljari] = s.nextDouble();
            teljari++;
        }
        profTilvik(x0, y0, F);

    }

    /**
     * <p>
     * Kastar exception ef annað fylkið er null, þ.e. tómt.
     * </p>
     *
     * @param x0 kommutölufylki
     * @param y0 kommutölufylki
     */
    public static void ekkiNull(double[] x0, double[] y0) {
        if (x0 == null || y0 == null) {
            throw new IllegalArgumentException("x0 eða y0 fylkin eru null");
        }
    }

    /**
     * <p>
     * Kastar fram exception ef fylkin eru ekki jafn löng
     * </p>
     *
     * @param x0 kommutölufylki
     * @param y0 kommutölufylki
     */
    public static void loglegarLengdir(double[] x0, double[] y0) {
        if (x0 != null && y0 != null && x0.length != y0.length) {
            throw new IllegalArgumentException("Lengdir x0 og y0 ekki þær sömu");
        }
    }

    /**
     * <p>
     * Athugar hvort punktur y_0 sé innan marka við f(x_0) = cos(x_0)+sqrt(x_0+5) þ.e.
     * f(x_0)-f < y_0 < f(x_0)-f.
     * </p>
     *
     * @param x0 kommutölufylki
     * @param y0 kommutölufylki
     * @param f  kommutala og mörkin sem y_0 þarf að vera innan
     * @return hversu margar kommutölur y_0 eu innan marka
     */
    public static int innanFerils(double[] x0, double[] y0, double f) {
        int teljari = 0;
        double y;
        for (int i = 0; i < x0.length; i++) {
            y = Math.cos(x0[i]) + Math.sqrt(x0[i] + 5);
            if (y0[i] < y + f && y0[i] > y - f) {
                teljari++;
            }
        }
        return teljari;
    }

    /**
     * <p>
     * Athugar hvort villa komi upp fyrir gefin fylki, keyrir svo innanFerils
     * fallið og prentar niðurstæðu að lokum út
     * </p>
     *
     * @param x0 kommutölufylki
     * @param y0 kommutölufylki
     * @param f  kommutala og mörkin
     */
    private static void profTilvik(double[] x0, double[] y0, double f) {
        int k = 0;
        try {
            ekkiNull(x0, y0);
        }
        catch (IllegalArgumentException i) {
            k = 1;
            System.out.println("x0 eða y0 fylkin eru null");
        }
        try {
            loglegarLengdir(x0, y0);

        }
        catch (IllegalArgumentException i) {
            k = 1;
            System.out.println("Lengdir x0 og y0 ekki þær sömu");
        }
        if (k != 1) {
            int t = innanFerils(x0, y0, f);
            System.out.println(
                    "Fjöldi innan marka er " + t + " sem er " + (((double) t / x0.length) * 100)
                            + "%");
        }


    }
}
