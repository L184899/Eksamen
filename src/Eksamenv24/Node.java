package Eksamenv24;

public class Node {
    int data;
    Node neste;

    public Node(int data){
        this.data = data;
        this.neste = null;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Node getNeste(){
        return neste;
    }

    public void setNeste(Node neste){
        this.neste = neste;
    }
}


