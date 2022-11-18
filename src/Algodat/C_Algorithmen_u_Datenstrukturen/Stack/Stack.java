package Algodat.C_Algorithmen_u_Datenstrukturen.Stack;

import Algodat.C_Algorithmen_u_Datenstrukturen.HTLStack;

public class Stack implements HTLStack {
    private Layer top;
    @Override
    public void push(int value) {
        Layer n = new Layer(value);
        if (top == null) {
            top = n;
        } else {
            n.setLast(top);
            top = n;
        }
    }

    @Override
    public int pop() {
        int x = top.getValue();
        top = top.getLast();
        return x;
    }

    @Override
    public int peak() {
        return top.getValue();
    }

}
