/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Tekur inn kommutölu af skipalínu, tekur rótina af henni og setur
 *            svo aftur í annað veldi. Prentar það gildi. Ef útreiknað gildi
 *            er stærra en upphafstalan prentast einnig út true, ef ekki
 *            prentast false.
 *
 *
 *****************************************************************************/

public class ErStaerra {
    public static void main(String[] args) {
        double k = Double.parseDouble(args[0]);
        double utkoma = Math.pow(Math.sqrt(k), 2);
        System.out.println(utkoma);
        boolean a = (utkoma > k);
        System.out.println(a);

    }
}
