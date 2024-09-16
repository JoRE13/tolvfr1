/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Tekur inn tvær kommutölur, margfaldar saman og prentar út.
 *
 *
 *****************************************************************************/

public class Flatarmal {
    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);
        double f = h * b;
        System.out.println(f);

    }
}
