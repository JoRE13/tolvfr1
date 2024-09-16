/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class Counter {
    private String nafn;
    private int efriMork;
    private int count;

    public Counter(String nafn, int efriMork) {
        this.nafn = nafn;
        this.efriMork = efriMork;
        count = 0;
    }

    public void increment() {
        if (count < efriMork) {
            count++;
        }
    }

    public int value() {
        return count;
    }

    public String toString() {
        return nafn + ", " + count;
    }

    public static void main(String[] args) {
        final int N = 2;
        Counter c = new Counter("Atkvæði", 1);
        c.increment();
        c.increment();
        System.out.println("Fyrir lykkju:" + c);
        for (int i = 0; i < N; i++) {
            c.increment();
        }
        System.out.println("Eftir lykkju:" + c);
        System.out.println("Gildi á teljara:" + c.value());
    }
}
