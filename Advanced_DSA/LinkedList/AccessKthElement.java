package Advanced_DSA.LinkedList;

public class AccessKthElement {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(0);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(9);
        Node f = new Node(1);
        Node g = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        pfun(a, 3);
    }
    public static void pfun(Node x, int k)
    {
        Node temp = x;
        for(int i=0;i<k;i++)
        {
            temp = temp.next;
        }
        System.out.println(temp.x);
    }
}
class Node
{
    int x;
    Node next;
    Node(int x)
    {
        this.x = x;
    }
}
