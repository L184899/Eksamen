package Eksamenv24;

public class MainNoder {
    public static void main(String[] args){

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        a.setNeste(b);
        b.setNeste(c);


        int antall = MetoderNode.antallNoderIterativ(a);
        System.out.println("Antall noder: " + antall);

        int maks = MetoderNode.finnMaksRekursiv(a);
        System.out.println("Største verdi: " + maks);


    }
}
