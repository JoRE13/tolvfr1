/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Throw {
    public static void main(String[] args) {
        try {
            daddy(-1);
        }
        catch (IllegalArgumentException i) {
            System.out.println(i.getMessage());
        }

        
    }

    public static double daddy(double n) {
        if (n < 0) {
            throw new IllegalArgumentException("integer must be positive " + n);
        }
        return Math.sqrt(n);
    }


}
