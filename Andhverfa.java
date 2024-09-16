import java.awt.Color;

/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre@hi.is
 *
 *  Lýsing  : Finnur andhverfu lits.
 *
 *
 *****************************************************************************/

public class Andhverfa {
    public static void main(String[] args) {
        int r = StdRandom.uniform(0, 256);
        int g = StdRandom.uniform(0, 256);
        int b = StdRandom.uniform(0, 256);
        Color litur = new Color(r, g, b);
        System.out.println(andhverfa(litur));

    }

    /**
     * <p>
     * reiknar andhverfu lits c með rgb gildi (r,g,b) en hann hefur rgb gildi
     * (255-r,255-g,255-b)
     * </p>
     *
     * @param c litur.
     * @return andhverfa litisins c
     */
    public static Color andhverfa(Color c) {
        Color andhverfa = new Color(255 - c.getRed(), 255 - c.getGreen(), 255 - c.getBlue());
        return andhverfa;
    }
}
