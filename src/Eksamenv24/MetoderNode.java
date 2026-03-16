package Eksamenv24;

public class MetoderNode {

    public static int antallNoderIterativ(Node foerste) {

        int antall = 0;
        Node current = foerste;

        while (current != null) {
            antall++;
            current = current.getNeste();
        }
        return antall;
    }

    public static int antallNoderRekursiv(Node foerste){
        if (foerste == null){
            return 0;
        }
        return 1 + antallNoderRekursiv(foerste.neste);
    }

    public static int sumAvNoder(Node foerste){
        if (foerste == null){
            return 0;
        }
        return foerste.getData() + sumAvNoder(foerste.getNeste());
    }

    public static int finnMaksRekursiv(Node foerste) {
        if (foerste == null) {
            throw new IllegalArgumentException("Listen er tom");
        }

        if (foerste.getNeste() == null) {
            return foerste.getData();
        }

        int maksIResten = finnMaksRekursiv(foerste.getNeste());

        if (foerste.getData() > maksIResten) {
            return foerste.getData();
        } else {
            return maksIResten;
        }
    }
}
