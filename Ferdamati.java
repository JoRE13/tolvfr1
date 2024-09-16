import java.util.Objects;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Klasinn ferðamáti sem að geymir ferðamáta og tilheyrandi kolefnis-
 *  *         spori hans.
 *
 *
 *****************************************************************************/

public class Ferdamati {
    private String ferdamati;
    private double spor;

    // smiður - tekur inn nafn ferðamáta og kolefnisspor hans
    Ferdamati(String f, double k) {
        ferdamati = f;
        spor = k;
    }

    // getterar
    public String getFerdamati() {
        return ferdamati;
    }

    public double getKolefnisspor() {
        return spor;
    }

    // flettir upp ferðamáta s í safni safn og skilar ferðamáta
    public static Ferdamati flettaUppFerdamati(String s, Ferdamati[] safn) {
        for (int i = 0; i < safn.length; i++) {
            if (Objects.equals(safn[i].getFerdamati(), s))
                return safn[i];
        }
        return null;
    }

    /**
     * Les inn af Scanner s ferdamati.length Ferdamati hluta
     * Dæmi
     * ganga 1.0
     * rafbíll 7.8
     * rafhlaupahjól 1.1
     * strætó 2.5
     *
     * @param s         Scanner sem lesið er úr. Endað á að lesa fram yfir loka línunnar
     * @param ferdamati fylki af mögulegum ferðamátum og kolefnisspori þeirra
     */
    public static void lesaSpor(Scanner s, Ferdamati[] ferdamati) {
        for (int i = 0; i < ferdamati.length; i++) {
            String l = s.next();
            double r = s.nextDouble();
            ferdamati[i] = new Ferdamati(l, r);
        }
        // Síðasta lína í ykkar forriti
        s.nextLine();
    }


    // prófanaaktygi fyrir Ferdamati
    public static void main(String[] args) {
    }
}
