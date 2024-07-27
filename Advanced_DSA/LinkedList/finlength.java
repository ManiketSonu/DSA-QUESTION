package Advanced_DSA.LinkedList;

public class finlength {
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(5);
        Node c = new Node(5);
        Node d = new Node(5);
        Node e = new Node(5);
        Node f = new Node(5);
        Node g = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        lengthg(a);
    }
    public static void lengthg(Node a)
    {
        Node temp = a;
        int len = 0;
        while(temp!=null)
        {
            temp = temp.next;
            len++;
        }
        System.out.println(len);
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
