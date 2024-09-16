/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  :Tekur inn heiltölu og kommutölu af skipalínu, reiknar út virdisaukaskatt með
 *           einföldum reikningu og prentar út.
 *
 *
 *****************************************************************************/

public class Virdisauki {
    public static void main(String[] args) {
        int u = Integer.parseInt(args[0]);
        double s = Double.parseDouble(args[1]);
        double v = u * (s / 100);

        System.out.println(v);
    }
}
