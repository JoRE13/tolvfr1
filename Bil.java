/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Klasinn Bil sem geymir minnsta og stærsta gildi bilsins.
 *
 *
 *****************************************************************************/


public class Bil {
    private double min;
    private double max;

    // smiður
    public Bil(double min, double max) {
        this.min = min;
        this.max = max;
    }

    /**
     * Athugar hvort að gildi x liggi innan bilsins
     *
     * @param x kommutala
     * @return sanngildi þess að x liggi innan bilsins
     */
    public boolean inniheldur(double x) {
        if (x <= max && x >= min) {
            return true;
        }
        return false;
    }


    /**
     * Athugar hvort að tvö bil skarast, þ.e. hvort að sniðmengi þeirra sé
     * ekki tómt.
     *
     * @param b bil sem á að athuga
     * @return skilar sanngildi þess að bilin skarast.
     */
    public boolean skarast(Bil b) {
        if (inniheldur(b.min) || inniheldur(b.max)) {
            return true;
        }
        if (b.min < min && max < b.max) {
            return true; // ef að allt bilið er innan í b
        }
        return false;
    }

    //skilar bilinu á formi strengs
    public String toString() {
        return "[" + min + "," + max + "]";
    }

    public static void main(String[] args) {
        Bil b1 = new Bil(3.5, 4.5);
        Bil b2 = new Bil(2.5, 4.0);
        Bil b3 = new Bil(2.5, 3.0);
        System.out.println("Gefin eru bil: " + b1 + ", " + b2 + " og " + b3);
        System.out.println("Bil " + b1 + " hefur stærsta gildi " + b1.max);
        System.out.println("Bil " + b2 + " hefur minnsta gildi " + b2.min);
        if (b1.inniheldur(4.0)) {
            System.out.println("Bil " + b1 + " inniheldur " + 4.0);
        }
        else System.out.println("Bil " + b1 + " inniheldur ekki " + 4.0);
        if (b3.inniheldur(1.0)) {
            System.out.println("Bil " + b3 + " inniheldur " + 1.0);
        }
        else System.out.println("Bil " + b3 + " inniheldur ekki " + 1.0);
        if (b1.skarast(b2)) {
            System.out.println("Bil " + b1 + " og bil " + b2 + " skarast");
        }
        else System.out.println("Bil " + b1 + " og bil " + b2 + " skarast ekki");
        if (b1.skarast(b3)) {
            System.out.println("Bil " + b1 + " og bil " + b3 + " skarast");
        }
        else System.out.println("Bil " + b1 + " og bil " + b3 + " skarast ekki");


    }
}

