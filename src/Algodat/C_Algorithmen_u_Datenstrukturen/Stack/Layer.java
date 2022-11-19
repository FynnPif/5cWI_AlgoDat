package Algodat.C_Algorithmen_u_Datenstrukturen.Stack;

public class Layer {
    private int value;
    private Layer last;

    public int getValue() {
        return value;
    }

    public Layer(int value) {
        this.value = value;
    }

    public Layer getLast() {
        return last;
    }

    public void setLast(Layer last) {
        this.last = last;
    }
}