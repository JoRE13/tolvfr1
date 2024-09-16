/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Tekur inn tvær tölur af skipanalínu mestaFjölda og mestuThyngd og
 *            velur að handahófi hluti úr fylki fatnadur þannig að heildrvigt
 *            staka úr fatnadur verði ekki meiri en mestaThyngd og að heildar-
 *            fjöldi hluta úr fatnadur verði ekki meiri en mestiFjöldi. Að lokum
 *            er heildarvigt og fjöldi stakanna úr fatnadur prentaður út og
 *            sérhver hlutur sem var valinn einnig prentaður út.
 *
 *
 *****************************************************************************/

public class Ferdataska {
    public static void main(String[] args) {
        final String[] fatnadur = {
                "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11", "A12", "A13",
                "A14",
                "A15", "A16"
        };
        final int[] vigt = { 1, 2, 3, 2, 1, 4, 3, 2, 5, 7, 3, 1, 3, 6, 4, 2 };
        final int n = vigt.length;
        int mestiFjoldi = Integer.parseInt(args[0]);
        int mestaThyngd = Integer.parseInt(args[1]);


        for (int i = 0; i < n; i++) {
            int r = StdRandom.uniform(i, n);
            String t = fatnadur[r];
            fatnadur[r] = fatnadur[i];
            fatnadur[i] = t;
            int s = vigt[r];
            vigt[r] = vigt[i];
            vigt[i] = s;
        }
        int fjoldiHluta = 0;
        int heildarVigt = 0;
        int teljari = 0;
        int[] notadir = new int[mestiFjoldi];
        while (fjoldiHluta < mestiFjoldi && heildarVigt < mestaThyngd) {
            if (heildarVigt + vigt[teljari] <= mestaThyngd) {
                heildarVigt += vigt[teljari];
                notadir[fjoldiHluta] = teljari;
                fjoldiHluta++;
            }
            teljari++;
            if (teljari == 16) {
                break;
            }
        }
        System.out.println(
                "Þú settir eftirfarandi " + fjoldiHluta + " hluti í ferðatöskuna sem vegur "
                        + heildarVigt + "kg");
        for (int i = 0; i < fjoldiHluta; i++) {
            System.out.print(fatnadur[notadir[i]] + ":" + vigt[notadir[i]] + " ");

        }
    }
}
