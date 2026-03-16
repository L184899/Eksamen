package no.hvl.binaersok1;

public class binmetode {

    public static <T extends Comparable<T>> int binaersok(T[] tabell, T verdi) {
        int venstre = 0;
        int hoyre = tabell.length - 1;

        while (venstre <= hoyre) {
            int midten = (venstre + hoyre) / 2;

            int cmp = verdi.compareTo(tabell[midten]);
            if (cmp == 0) {
                return midten;
            } else if (cmp < 0) {
                hoyre = midten - 1;
            } else {
                venstre = midten + 1;
            }
        }
        return -1;
    }
}