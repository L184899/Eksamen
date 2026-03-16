package no.hvl.dat102;

public class KjedetBSTre<T extends Comparable<T>>
        implements BSTreADT<T> {

    private BinaerTreNode<T> rot;
    private int antall;

    public KjedetBSTre() {
        rot = null;
        antall = 0;
    }

    @Override
    public boolean erTom() {
        return antall == 0;
    }

    @Override
    public int antall() {
        return antall;
    }

    @Override
    public void leggTil(T element) {
        rot = leggTilRek(rot, element);
    }

    @Override
    public T fjern(T element) {
        return null;
    }

    private BinaerTreNode<T> leggTilRek(BinaerTreNode<T> node, T element) {

        if (node == null) {
            antall++;
            return new BinaerTreNode<>(element);
        }

        if (element.compareTo(node.getElement()) < 0) {
            node.setVenstre(leggTilRek(node.getVenstre(), element));
        } else {
            node.setHoyre(leggTilRek(node.getHoyre(), element));
        }

        return node;
    }

    @Override
    public boolean inneholder(T element) {
        return inneholderRek(rot, element);
    }

    private boolean inneholderRek(BinaerTreNode<T> node, T element) {

        if (node == null) return false;

        int cmp = element.compareTo(node.getElement());

        if (cmp == 0) return true;
        if (cmp < 0) return inneholderRek(node.getVenstre(), element);
        else return inneholderRek(node.getHoyre(), element);
    }

    @Override
    public T finnMinste() {
        if (erTom()) {
            throw new EmptyCollectionException("Ingen element funnet");
        }
        BinaerTreNode<T> current = rot;

        while (current.getVenstre() != null) {
            current = current.getVenstre();
        }
        return current.getElement();
    }

    public T finnStorste() {
        if (erTom()) {
            throw new EmptyCollectionException("Ingen element funnet");
        }
        BinaerTreNode<T> current = rot;

        while (current.getHoyre() != null) {
            current = current.getHoyre();
        }
        return current.getElement();
    }

    @Override
    public int antallBlad() {
        return antallBladRek(rot);
    }

    private int antallBladRek(BinaerTreNode<T> node) {

        if (node == null) return 0;

        if (node.getVenstre() == null && node.getHoyre() == null) {
            return 1;
        }

        return antallBladRek(node.getVenstre()) +
                antallBladRek(node.getHoyre());
    }

    public int antallBlad2() {
        return antallBladRek2(rot);
    }

    private int antallBladRek2(BinaerTreNode<T> node) {

        if (node == null) return 0;

        if (node.getVenstre() == null && node.getHoyre() == null) {
            return 1;
        }

        return antallBladRek2(node.getVenstre()) + antallBladRek2(node.getHoyre());
    }


}
