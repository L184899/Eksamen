package no.hvl.dat102;

public class MainBStre {
    public static void main(String[] args) {
        KjedetBSTre<Integer> tre = new KjedetBSTre<>();

        tre.leggTil(8);
        tre.leggTil(4);
        tre.leggTil(12);
        tre.leggTil(2);
        tre.leggTil(6);
        tre.leggTil(10);
        tre.leggTil(14);

        System.out.println("Antall blad: " + tre.antallBlad());
    }

}
