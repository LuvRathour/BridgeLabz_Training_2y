package Linklist;

public class Basics {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }
    public static Node head;
    public static Node tail;

    public static void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ->");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        head = a;
        tail = e;
        a.prev= null;
        a.next= b;
        b.prev= a;
        a.next.next= c;
        c.prev= b;
        a.next.next.next= d;
        d.prev= c;
        a.next.next.next.next= e;
        e.prev= d;
        display();
    }
}