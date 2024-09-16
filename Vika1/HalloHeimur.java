import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Prentar út Halló heimur Jóhannes Reykdal Einarsson á console
 *
 *
 *****************************************************************************/

public class HalloHeimur {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, "UTF-8");
        int a = s.nextInt();
        int b = s.nextInt();
        if (a <= b) {
            System.out.print(a + " " + b);
        }
        else System.out.print(b + " " + a);
    }

}
