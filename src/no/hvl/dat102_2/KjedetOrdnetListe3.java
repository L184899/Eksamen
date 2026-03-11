package no.hvl.dat102_2;

import no.hvl.dat102.EmptyCollectionException;
import no.hvl.dat102.LinearNode;

public class KjedetOrdnetListe3<T extends Comparable<T>> {

    private int antall;
    private LinearNode2<T> foerste;
    private LinearNode2<T> siste;

    public KjedetOrdnetListe3() {
        foerste = null;
        siste = null;
        antall = 0;
    }

    // Getters og setters
    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public LinearNode2<T> getFoerste() {
        return foerste;
    }

    public void setFoerste(LinearNode2<T> foerste) {
        this.foerste = foerste;
    }

    public LinearNode2<T> getSiste() {
        return siste;
    }

    public void setSiste(LinearNode2<T> siste) {
        this.siste = siste;
    }

    // Enkle metoder
    public int antall() {
        return antall;
    }

    public boolean erTom() {
        return antall == 0;
    }

    //int finn antall iterativt
    //finn antall rekrusivt
    //fjern alle
    //fjern første
    //erLik
    //snu
    //finnMaks høyeste
    //sum av noder

    //finn minste

    public T finnMinsteStigende() { //her med stigende liste
        if (erTom()) {
            throw new EmptyCollectionException("Listen er tom");
        }
        return foerste.getElement();
    }

    public T finnMinste() { //her med liste i tilfeldig ordre
        if (erTom()) {
            throw new EmptyCollectionException("Listen er tom");
        }

        T minste = foerste.getElement();
        LinearNode2<T> current = foerste.getNeste();

        while (current != null) {
            if (current.getElement().compareTo(minste) < 0) {
                minste = current.getElement();
            }
            current = current.getNeste();
        }

        return minste;
    }

    public T finnMaksStigende() { //her med stigende liste
        if (erTom()) {
            throw new EmptyCollectionException("listen er tom");
        }

        return siste.getElement();
    }

    public T finnMaks() {
        if (erTom()) {
            throw new EmptyCollectionException("Listen er tom");
        }

        T maks = foerste.getElement();
        LinearNode2<T> current = foerste.getNeste();

        while (current != null) {
            if (current.getElement().compareTo(maks) > 0) {
                maks = current.getElement();
            }
            current = current.getNeste();
        }
        return maks;
    }

    public boolean inneholder(T element) {
        LinearNode2<T> current = foerste;

        while (current != null) {
            if (current.getElement().compareTo(element) == 0) {
                return true;
            } else current = current.getNeste();
        }
        return false;
    }

    public void leggTil(T element) { //liste med stigende rekkefølge

        LinearNode2<T> nyNode = new LinearNode2<>(element);
        if (erTom()) {
            foerste = nyNode;
            siste = nyNode;
        } else if (element.compareTo(foerste.getElement()) <= 0) {
            nyNode.setNeste(foerste);
            foerste = nyNode;
        } else {
            LinearNode2<T> current = foerste;

            while (current.getNeste() != null && current.getElement().compareTo(element) < 0) {
                current = current.getNeste();
            }

            nyNode.setNeste(current.getNeste());
            current.setNeste(nyNode);

            if (nyNode.getNeste() == null) {
                siste = nyNode;
            }
        }
        antall++;
    }
}