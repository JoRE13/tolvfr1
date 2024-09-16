/******************************************************************************
 *  Nafn    : Jóhannnes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Tekur inn af skipanalínunni kommutölunar efri on neðri. Les síðan
 *            inn ótiltekin fjölda af kommutölum af staðalinntaki og prentar út
 *            allar þær nema sem liggja á bilinu frá og með neðri til og með
 *            efri.
 *
 *
 *****************************************************************************/

import java.util.Scanner;

public class FilterOut {
    public static void main(String[] args) {
        double nedri = Double.parseDouble(args[0]);
        double efri = Double.parseDouble(args[1]);
        Scanner s = new Scanner(System.in, "UTF-8");
        while (s.hasNext()) {
            double x = s.nextDouble();
            if (x > efri || x < nedri) {
                System.out.print(x + " ");
            }
        }

    }
}
