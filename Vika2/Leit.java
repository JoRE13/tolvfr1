/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Forrit segir til um hversu oft ákveðið orð kemur fyrir í skrá.
 *
 *
 *****************************************************************************/

public class Leit {
    public static void main(String[] args) {
        String ord = args[0];
        System.out.println(leit("nemendur.txt", ord));
    }

    /**
     * <p>
     * fallið fer línu fyrir línu í gegnum skrána og athugar hversu oft strengurinn
     * kemur fyrir í línunni.
     * </p>
     *
     * @param nafnASkra Skrá sem leita á í
     * @param ord       sem á að leita af í skrá
     * @return hversu oft orðið kemur fyrir í skránni
     */
    public static int leit(String nafnASkra, String ord) {
        In in = new In(nafnASkra);
        int teljari = 0;
        while (in.hasNextLine()) {
            String t = in.readLine();
            if (t.contains(ord)) {
                teljari++;
            }
        }
        return teljari;
    }
}
