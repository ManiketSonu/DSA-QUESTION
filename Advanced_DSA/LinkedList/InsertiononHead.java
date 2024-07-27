package Advanced_DSA.LinkedList;

public class InsertiononHead {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(0);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(9);
        Node f = new Node(1);
        Node g = new Node(5);
        Node h = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        Insertathead(a, h);
        // printtt(g);
    }
    public static void Insertathead(Node head, Node y)
    {
        y.next = head;
        head = y;
        printtt(head);
    }
    public static void printtt(Node x)
    {
        Node temp = x;
        while(temp!=null)
        {
            System.out.println(temp.x);
            temp = temp.next;
        }
    }
}
class Node{
    int x;
    Node next;
    Node(int x)
    {
        this.x = x;
        this.next=null;
    }
}