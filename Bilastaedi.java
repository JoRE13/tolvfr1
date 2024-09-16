/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Tekur inn tvo strengi, bílnúmer og verðflokk, og tvær heiltölur
 *            ,tími inn og tími út. Forritið reiknar svo verðið á því að leggja
 *            útfrá tíma og verðflokki og prentar út ásamt bílnúmeri.
 *
 *
 *****************************************************************************/

public class Bilastaedi {
    public static void main(String[] args) {
        String num = args[0];
        String flokkur = args[1];
        int inn = Integer.parseInt(args[2]);
        int ut = Integer.parseInt(args[3]);
        int gjald;
        if (flokkur.equals("A")) {
            gjald = 450;
        }
        else if (flokkur.equals("B")) {
            gjald = 600;
        }
        else if (flokkur.equals("U")) {
            gjald = 750;
        }
        else gjald = 900;

        int heild = (ut - inn) * gjald;
        System.out.println(num + " " + heild);
    }

}
