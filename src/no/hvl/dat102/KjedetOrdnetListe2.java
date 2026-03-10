package no.hvl.dat102;

public class KjedetOrdnetListe2<T extends Comparable<T>> {

    private int antall;
    private LinearNode<T> foerste;
    private LinearNode<T> siste;

    public KjedetOrdnetListe2() {
        foerste = null;
        siste = null;
        antall = 0;
    }

    // -----------------------
    // Getters og setters
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
    // Enkle metoder
    // -----------------------
    public int antall() {
        return antall;
    }

    public boolean erTom() {
        return antall == 0;
    }

    // -----------------------
    // Oppgave 7a bygger på denne
    // -----------------------
    public boolean erLike(KjedetOrdnetListe2<T> denAndre) {
        if (antall == denAndre.antall) {
            return erLikRek(foerste, denAndre.foerste);
        } else {
            return false;
        }
    }

    // -----------------------
    // Oppgave 7a: skal fylles ut
    // -----------------------
    private boolean erLikRek(LinearNode<T> p1, LinearNode<T> p2) {
    if (p1 == null && p2 == null){
        return true;
    }

    if (!p1.getElement().equals(p2.getElement())){
        return false;
    }
    return erLikRek(p1.getNeste(), p2.getNeste());
    }

    // -----------------------
    // Oppgave 7b: hvis det finnes en ny metode i oppgaven,
    // kan du fylle den inn her
    // -----------------------
    public void leggTil(T element) {
        throw new UnsupportedOperationException("TODO oppgave 7");
    }

    public void snu(){
        if (erTom() || foerste == siste){
            return;
        }

        LinearNode<T> forrige = null;
        LinearNode<T> current = foerste;
        LinearNode<T> neste;

        siste = foerste;

        while (current != null){
            neste = current.getNeste();
            current.setNeste(forrige);
            forrige = current;
            current = neste;
        }
        foerste = forrige;
    }

    // -----------------------
    // Praktisk for testing
    // -----------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        LinearNode<T> current = foerste;

        while (current != null) {
            sb.append(current.getElement());
            current = current.getNeste();
            if (current != null) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}