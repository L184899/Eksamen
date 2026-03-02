package no.hvl.dat102;

public class BinaerTreNode<T> {

    private T element;
    private BinaerTreNode<T> venstre;
    private BinaerTreNode<T> hoyre;

    public BinaerTreNode(T elem) {
        element = elem;
        venstre = null;
        hoyre = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T elem) {
        element = elem;
    }

    public BinaerTreNode<T> getVenstre() {
        return venstre;
    }

    public void setVenstre(BinaerTreNode<T> venstre) {
        this.venstre = venstre;
    }

    public BinaerTreNode<T> getHoyre() {
        return hoyre;
    }

    public void setHoyre(BinaerTreNode<T> hoyre) {
        this.hoyre = hoyre;
    }
}