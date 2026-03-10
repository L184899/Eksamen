package no.hvl.dat102;

public class TestProgram {

    public static void main(String[] args) {

        KjedetOrdnetListe2<Integer> liste1 = new KjedetOrdnetListe2<>();
        KjedetOrdnetListe2<Integer> liste2 = new KjedetOrdnetListe2<>();

        // -------------------------
        // Bygg liste1: 10 -> 30 -> 50 -> 70
        // -------------------------
        LinearNode<Integer> n1 = new LinearNode<>(10);
        LinearNode<Integer> n2 = new LinearNode<>(30);
        LinearNode<Integer> n3 = new LinearNode<>(50);
        LinearNode<Integer> n4 = new LinearNode<>(70);

        n1.setNeste(n2);
        n2.setNeste(n3);
        n3.setNeste(n4);

        liste1.setFoerste(n1);
        liste1.setSiste(n4);
        liste1.setAntall(4);

        // -------------------------
        // Bygg liste2: 10 -> 30 -> 50 -> 70
        // -------------------------
        LinearNode<Integer> m1 = new LinearNode<>(10);
        LinearNode<Integer> m2 = new LinearNode<>(30);
        LinearNode<Integer> m3 = new LinearNode<>(50);
        LinearNode<Integer> m4 = new LinearNode<>(70);

        m1.setNeste(m2);
        m2.setNeste(m3);
        m3.setNeste(m4);

        liste2.setFoerste(m1);
        liste2.setSiste(m4);
        liste2.setAntall(4);

        // -------------------------
        // Test erLike
        // -------------------------
        System.out.println("Liste 1: " + liste1);
        System.out.println("Liste 2: " + liste2);
        System.out.println("Er like? " + liste1.erLike(liste2));

        // -------------------------
        // Endre liste2 for å teste false
        // -------------------------
        m3.setElement(99);

        System.out.println("\nEtter endring i liste2:");
        System.out.println("Liste 1: " + liste1);
        System.out.println("Liste 2: " + liste2);
        System.out.println("Er like? " + liste1.erLike(liste2));

        // -------------------------
        // Test snu på liste1
        // -------------------------
        System.out.println("\nFør snu liste1:");
        System.out.println("Liste 1: " + liste1);

        liste1.snu();

        System.out.println("Etter snu liste1:");
        System.out.println("Liste 1: " + liste1);
    }
}