import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

class Spil {

    private String sort;
    private int gildi;

    public Spil(String s, int g) {
        sort = s;
        gildi = g;
    }

    public String getSort() {
        return sort;
    }

    public int getGildi() {
        return gildi;
    }


    // Skilar samtölunni af gildum fyrir spilið s (Spil s) og þessu spili
    public int plus(Spil s) {
        return s.getGildi() + gildi;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, "UTF-8");
        Spil s1 = new Spil(s.next(), s.nextInt());
        Spil s2 = new Spil(s.next(), s.nextInt());
        System.out.println(s1.plus(s2));
        System.out.println(s1.getSort());
        System.out.println(s2.getGildi());
    }
}
