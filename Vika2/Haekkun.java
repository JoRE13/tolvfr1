/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Forritið tekur inn tvær heiltölur af skipalínu, reiknar mismun
 *            þeirra og prentar mismunin út.
 *
 *
 *****************************************************************************/

public class Haekkun {
    public static void main(String[] args) {
        int h1 = Integer.parseInt(args[0]);
        int h2 = Integer.parseInt(args[1]);
        int dh = h2 - h1;
        System.out.println(dh);

    }
}
