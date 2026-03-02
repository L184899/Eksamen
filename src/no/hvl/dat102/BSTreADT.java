package no.hvl.dat102;

public interface BSTreADT<T extends Comparable<T>> {

    void leggTil(T element);

    T fjern(T element);

    boolean inneholder(T element);

    T finnMinste();

    boolean erTom();

    int antall();

    int antallBlad();
}
