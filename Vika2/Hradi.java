/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Tekur inn tvær heiltölur af skipalínu, leggur þær saman, gerir að
 *            kommutölu og deilir með tveimur til að fá meðalgildið. Athugar
 *            hvort meðalgildið sé minni en 50 og prentar það svo út og sann-
 *            gildi booleansins.
 *
 *
 *****************************************************************************/

public class Hradi {
    public static void main(String[] args) {
        int v1 = Integer.parseInt(args[0]);
        int v2 = Integer.parseInt(args[1]);
        double vm = ((double) (v1 + v2)) / 2;
        boolean y = vm < 50;
        System.out.println(vm + " " + y);

        
    }

}
