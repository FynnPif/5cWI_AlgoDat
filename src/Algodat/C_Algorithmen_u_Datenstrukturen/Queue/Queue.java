package Algodat.C_Algorithmen_u_Datenstrukturen.Queue;

import Algodat.C_Algorithmen_u_Datenstrukturen.HTLQueue;

public class Queue implements HTLQueue {
    private Element first;
    private Element last;

    @Override
    public void enqueue(int value) {
        Element q = new Element(value);

        if (first == null) {
            first = q;
            last = q;
        } else {
            last.setNext(q);
            last = q;
        }

    }

    @Override
    public int dequeue() {
        int x = first.getValue();
        first = first.getNext();
        return x;
    }
}
