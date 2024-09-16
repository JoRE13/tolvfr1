/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Tekur inn heiltöluna tala af skipanalínu. Deilum tölu með 16
 *            og tala fær gildi útkomunnar. Afgangur deilingarnar samsvarar þá
 *            streng í sextan fylkinu og er honum bætt við útkomu strenginn s.
 *            Svo eru sömu skref endurtekin þangað til tala verður 0. Þá er s
 *            prentaður út.
 *
 *
 *****************************************************************************/

public class DecHex {
    public static void main(String[] args) {
        int tala = Integer.parseInt(args[0]);
        String[] sextan = {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"
        };
        String s = "";
        int afgangur = 0;
        while (tala != 0) {
            afgangur = tala % 16;
            tala = (tala - afgangur) / 16;
            s = sextan[afgangur] + s;
        }
        System.out.println(s);
    }
}
