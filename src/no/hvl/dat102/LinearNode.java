package no.hvl.dat102;

public class LinearNode<T> {

    private T element;
    private LinearNode<T> neste;

    public LinearNode(T elem) {
        element = elem;
        neste = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T elem) {
        element = elem;
    }

    public LinearNode<T> getNeste() {
        return neste;
    }

    public void setNeste(LinearNode<T> neste) {
        this.neste = neste;
    }
}
