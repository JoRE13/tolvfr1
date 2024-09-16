/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Deiling {
    public static void main(String[] args) {
        In in = new In("deiling.txt");
        int n = in.readInt();
        for (int i = 0; i < n; i++) {
            int tel = in.readInt();
            int nef = in.readInt();
            int deil = deiling(tel, nef);
            System.out.println(tel + "/" + nef + "=" + deil);
        }
    }

    /**
     * <p>
     * Endurkvæmt fall sem að deilir nefnara í teljara
     * </p>
     *
     * @param teljari heiltala sem er deilt í.
     * @param nefnari heiltala sem að deilt er með.
     * @return útkoma deilingar
     */
    public static int deiling(int teljari, int nefnari) {
        if (nefnari == 0) return Integer.MAX_VALUE;
        int t = Math.abs(teljari);
        int n = Math.abs(nefnari);
        if (t < n) return 0;
        if ((teljari >= 0 && nefnari >= 0) || (teljari < 0 && nefnari < 0)) {
            return 1 + deiling(t - n, n);//báðir jákvæðir til þess að halda í jákvæða hluta
        }
        else return -1 + deiling(t - n,
                                 -n);//til þess að þetta haldi áfram í neikvæða hluta, geta ekki báðir verið neg því annars væri t<n og það skilar 0.


    }
}
