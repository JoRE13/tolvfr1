/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Tekur inn tvö heiltölugildi a og b. Síðan er char gildið fundið
 *            fyrir a, a+b, og a+b+b. Forritið prentar svo út a, a+b, a+b+b,
 *            a+b og a.
 *
 *
 *****************************************************************************/

public class ABBA {
    public static void main(String[] args) {
        int aTala = Integer.parseInt(args[0]);
        int bil = Integer.parseInt(args[1]);

        char ch1 = (char) aTala;
        char ch2 = (char) (aTala + bil);
        char ch3 = (char) (aTala + 2 * bil);

        System.out.println(ch1 + "" + ch2 + "" + "" + ch3 + "" + ch2 + "" + "" + ch1);


    }
}
