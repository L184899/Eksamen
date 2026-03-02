package no.hvl.dat102;

public interface OrdnetListeADT<T extends Comparable<T>> {

    void leggTil(T element);

    T fjern(T element);

    T fjernFoerste();

    T fjernSiste();

    T finnFoerste();

    T finnSiste();

    boolean inneholder(T element);

    boolean erTom();

    int antall();
}
