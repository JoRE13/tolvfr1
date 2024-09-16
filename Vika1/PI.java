/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/


public class PI {
    public static void main(String[] args) {
        System.out.println(pi());
    }

    public static double pi() {
        double Pi = 0;
        for (int i = 0; i < 1000; i++) {
            Pi += Math.pow(-1, i) / (double) (2 * i + 1);
        }
        return Pi * 4;
    }
}
