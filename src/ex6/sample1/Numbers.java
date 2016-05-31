package ex6.sample1;

public class Numbers {
    public static void main(String args[]) {
        Node no4 = new Node("Four");
        Node no3 = new Node("Three");
        Node no2 = new Node("Two");
        Node no1 = new Node("One");

        no4.setNext(no3);
        no3.setNext(no2);
        no2.setNext(no1);
        for (Node n = no4; n != null; n = n.getNext()) {
            System.out.println(n);
        }
    }
}
