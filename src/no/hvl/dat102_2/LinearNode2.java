package no.hvl.dat102_2;

public class LinearNode2<T> {

    private T element;
    private LinearNode2<T> neste;

    public LinearNode2(T elem) {
        element = elem;
        neste = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T elem) {
        element = elem;
    }

    public LinearNode2<T> getNeste() {
        return neste;
    }

    public void setNeste(LinearNode2<T> neste) {
        this.neste = neste;
    }
}

