/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class ReadTala {
    private final int a;
    private final int b;

    public ReadTala(int a, int b) {
        int sam = gcd(a, b);
        this.a = a / sam;
        this.b = b / sam;
        if (b == 0) throw new IllegalArgumentException("deiling með 0");

    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public ReadTala sinnum(ReadTala y) {
        int za = a * y.a;
        int zb = b * y.b;
        ReadTala z = new ReadTala(za, zb);
        return z;
    }

    public ReadTala plus(ReadTala y) {
        int za = a * y.b + y.a * b;
        int zb = b * y.b;
        return new ReadTala(za, zb);
    }

    public String toString() {
        if (b == 1) return "" + a;
        return "" + a + "/" + b;
    }

    public static void main(String[] args) {
        try {
            ReadTala x = new ReadTala(4, 8);
            System.out.println(x);
            ReadTala y = new ReadTala(4, -8);
            System.out.println(y);
            ReadTala z = x.plus(y);
            ReadTala w = x.sinnum(y);
            System.out.println(z + " " + w);
        }
        catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }

    }

  
}
