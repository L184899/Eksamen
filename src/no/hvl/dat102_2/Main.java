package no.hvl.dat102_2;

public class Main {
    public static void main(String[] args) {

        // Lage første liste: 10 -> 30 -> 50 -> 70
        KjedetOrdnetListe3<Integer> liste1 = new KjedetOrdnetListe3<>();

        LinearNode2<Integer> n1 = new LinearNode2<>(10);
        LinearNode2<Integer> n2 = new LinearNode2<>(30);
        LinearNode2<Integer> n3 = new LinearNode2<>(50);
        LinearNode2<Integer> n4 = new LinearNode2<>(70);

        n1.setNeste(n2);
        n2.setNeste(n3);
        n3.setNeste(n4);

        liste1.setFoerste(n1);
        liste1.setSiste(n4);
        liste1.setAntall(4);

        // Lage andre liste: 10 -> 30 -> 50 -> 70
        KjedetOrdnetListe3<Integer> liste2 = new KjedetOrdnetListe3<>();

        LinearNode2<Integer> m1 = new LinearNode2<>(10);
        LinearNode2<Integer> m2 = new LinearNode2<>(30);
        LinearNode2<Integer> m3 = new LinearNode2<>(50);
        LinearNode2<Integer> m4 = new LinearNode2<>(70);

        m1.setNeste(m2);
        m2.setNeste(m3);
        m3.setNeste(m4);

        liste2.setFoerste(m1);
        liste2.setSiste(m4);
        liste2.setAntall(4);

        // Skrive ut litt info
        System.out.println("Liste 1 antall: " + liste1.antall());
        System.out.println("Liste 2 antall: " + liste2.antall());

        System.out.println("Liste 1 første element: " + liste1.getFoerste().getElement());
        System.out.println("Liste 1 andre element: " + liste1.getFoerste().getNeste().getElement());
        System.out.println("Liste 1 siste element: " + liste1.getSiste().getElement());

        System.out.println("Liste 2 første element: " + liste2.getFoerste().getElement());
        System.out.println("Liste 2 andre element: " + liste2.getFoerste().getNeste().getElement());
        System.out.println("Liste 2 siste element: " + liste2.getSiste().getElement());
    }
}