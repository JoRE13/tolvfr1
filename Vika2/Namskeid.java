/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Tekur inn þrjá strengi af skipalínu, skeytir þeim saman í nýjan
 *            streng og prentar hann út.
 *
 *
 *****************************************************************************/

public class Namskeid {
    public static void main(String[] args) {
        String fag = args[0];
        String tala = args[1];
        String bok = args[2];
        String namskeid = fag + tala + bok;
        System.out.println(namskeid);

    }
}
