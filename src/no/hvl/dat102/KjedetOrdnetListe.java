package no.hvl.dat102;

public class KjedetOrdnetListe<T extends Comparable<T>> implements OrdnetListeADT<T> {

    private int antall;
    private LinearNode<T> foerste; // kunstig første-node (minVerdi)
    private LinearNode<T> siste;   // kunstig siste-node (maksVerdi)

    // -----------------------
    // Getters / setters (kan antas finnes)
    // -----------------------
    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public LinearNode<T> getFoerste() {
        return foerste;
    }

    public void setFoerste(LinearNode<T> foerste) {
        this.foerste = foerste;
    }

    public LinearNode<T> getSiste() {
        return siste;
    }

    public void setSiste(LinearNode<T> siste) {
        this.siste = siste;
    }

    // -----------------------
    // Oppgave 6a: Konstruktør med minVerdi og maksVerdi
    // -----------------------
    public KjedetOrdnetListe(T minVerdi, T maksVerdi) {
        // TODO 6a: sett opp to kunstige noder (foerste=minVerdi, siste=maksVerdi),
        foerste = new LinearNode<>(minVerdi);
        siste = new LinearNode<>(maksVerdi);
        foerste.setNeste(siste);
        antall = 0;
    }

    // -----------------------
    // Gitt / enkel funksjonalitet
    // -----------------------
    @Override
    public int antall() {
        return antall;
    }

    @Override
    public boolean erTom() {
        return antall == 0;
    }

    // -----------------------
    // Oppgave 6b: finnMaks()
    // -----------------------
    public T finnMaks() {
        if (erTom()) {
            throw new EmptyCollectionException("ordnet liste er tom");
        }
        LinearNode<T> current = foerste;
        while (current.getNeste() != siste) {
            current = current.getNeste();
        }
        return current.getElement();
    }

    public T finnMinst() {
        if (erTom()) {
            throw new EmptyCollectionException("ordnet liste er tom");
        }
        return foerste.getNeste().getElement();
    }

    // -----------------------
    // Oppgave 6c: fjernAlle(T el)
    // -----------------------
    public boolean fjernAlle(T el) {
        if (erTom()) {
            throw new EmptyCollectionException("tom ordnet liste");
        }
        boolean fjernet = false;

        LinearNode<T> forrige = foerste;
        LinearNode<T> current = foerste.getNeste();

        while (current != siste && current.getElement().compareTo(el) < 0) {
            forrige = current;
            current = current.getNeste();
        }

        while (current != siste && current.getElement().compareTo(el) == 0) {
            forrige.setNeste(current.getNeste());
            current = forrige.getNeste();

            antall--;
            fjernet = true;
        }
        return fjernet;
    }

    // -----------------------
    // Resten av ADT-en (ikke nødvendig for oppg. 6)
    // Vi lar dem være stubs så klassen kan kompileres.
    // -----------------------
    @Override
    public void leggTil(T element) {
        throw new UnsupportedOperationException("Ikke nødvendig for oppg. 6 (med mindre oppgaveteksten sier det)");
    }

    @Override
    public T fjern(T element) {
        throw new UnsupportedOperationException("Ikke implementert");
    }

    @Override
    public T fjernFoerste() {
        throw new UnsupportedOperationException("Ikke implementert");
    }

    @Override
    public T fjernSiste() {
        throw new UnsupportedOperationException("Ikke implementert");
    }

    @Override
    public T finnFoerste() {
        throw new UnsupportedOperationException("Ikke implementert");
    }

    @Override
    public T finnSiste() {
        throw new UnsupportedOperationException("Ikke implementert");
    }

    @Override
    public boolean inneholder(T element) {
        throw new UnsupportedOperationException("Ikke implementert");
    }
}