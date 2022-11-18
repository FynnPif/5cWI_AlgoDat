package Algodat.C_Algorithmen_u_Datenstrukturen.Stack;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.println(s.peak());
        System.out.println(s.peak());
    }
}
