/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Einkunn klasinn sem að geymir mætingarhlutfall og lokapróf.
 *
 *
 *****************************************************************************/

public class Einkunn2 {
    private double maetingHlutfall;
    private int lokaprof;

    /**
     * Smiður fyrir klasann. Skilgreinir tilviksbreyturnar og athugar
     * hvort að gildi þeirra séu lögleg.
     *
     * @param m mætingarhlutfall, kommutala
     * @param l einkunn á lokapófi, heiltala
     */
    public Einkunn2(double m, int l) {
        maetingHlutfall = 0.0;
        lokaprof = l;
        if (erLoglegt(m)) {
            maetingHlutfall = m;
        }
    }

    /**
     * Athugar hvort gefin tala á mætingarhlutfalli sé lögleg
     *
     * @param m mætingarhlutfall, kommutala
     * @return true ef lögleg annars false
     */
    private boolean erLoglegt(double m) {
        if (m <= 1 && m >= 0) {
            return true;
        }
        return false;
    }

    /**
     * @return skilar gildi á lokapróf
     */
    public int getLokaprof() {
        return lokaprof;
    }

    /**
     * gefur tilviksbreytunni lokapróf nýtt gildi
     *
     * @param l nýtt gildi á lokapróf, heiltala
     */
    public void setLokaprof(int l) {
        lokaprof = l;
    }

    /**
     * @return skilar gildi á mætingarhlutfalli, kommutala
     */
    public double getMaetingHlutfall() {
        return maetingHlutfall;
    }

    /**
     * gefur tilviksbreytunni mætingHlutfall nýtt gildi
     *
     * @param m nýtt gildi á mætingHlutfall, kommutala
     */
    public void setMaetingHlutfall(double m) {
        if (erLoglegt(m)) {
            maetingHlutfall = m;
        }
    }

    /**
     * Athugar hvort gildi lokapróf sé yfir 5.
     *
     * @return sanngildi þeirrar yrðingar
     */
    public boolean erLagmarkseinkunn() {
        if (lokaprof >= 5) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Einkunn2 e = new Einkunn2(0.5, 6);
        e.setLokaprof(3);
        System.out.println(e.getLokaprof());
        e.setMaetingHlutfall(2.0);
        System.out.println(e.getMaetingHlutfall());
        System.out.println("einkunn er fyrir ofan lágmarkseinkunn? " + e.erLagmarkseinkunn());

        Einkunn2 e2 = new Einkunn2(-0.3, 10);
        System.out.println(e2.getMaetingHlutfall());
    }
}
