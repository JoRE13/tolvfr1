/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Forrit sem að reiknar summu átta nágrannastaka staks (i,j) í NxN
 *            fylki.
 *
 *
 *****************************************************************************/

public class Summa {
    public static void main(String[] args) {
        int tolur[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 4, 3, 2, 1 }, { 1, 1, 1, 1 } };
        System.out.println(summa(1, 1, tolur));
        System.out.println(summa(2, 2, tolur));

    }

    /**
     * <p>
     * Reiknar summu nágrannastaka staks (i,j) í tvívíðu fylki tölur.
     * </p>
     *
     * @param i     línunúmer staks sem reikna á summu í kring
     * @param j     dálknúmer staks sem reikna á summu í kring
     * @param tolur tvívítt NxN fyllki sem stak (i,j) er í
     * @return summu nágrannastaka (i,j)
     */
    public static int summa(int i, int j, int[][] tolur) {
        int summa = 0;
        for (int m = i - 1; m <= i + 1; m++) {
            for (int n = j - 1; n <= j + 1; n++) {
                summa += tolur[m][n];
            }
        }
        return summa - tolur[i][j];
    }


}
