/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Tekur inn tvær tölur n og m af skipalínu og býr til n x m fylki
 *            með annaðhvort true eða false í sérhverju sæti. Ef gildi í sætinu
 *            er true þá er premtuð út stjarna en myllumerki ef gildið er ósatt.
 *
 *
 *****************************************************************************/

public class BFylki {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        boolean sann[][] = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sann[i][j] = StdRandom.bernoulli();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (sann[i][j]) {
                    System.out.print("* ");
                }
                else System.out.print("# ");
            }
            System.out.println();
        }


    }
}
