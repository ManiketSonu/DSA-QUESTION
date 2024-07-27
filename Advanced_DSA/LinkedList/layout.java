package Advanced_DSA.LinkedList;

public class layout {
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(8);
        a.next = b;
        b.next = c;
        c.next = null;
        pfun(a);
    }
    public static void pfun(Node a)
    {
        Node temp = a;
        while(temp!=null)
        {
            System.out.println(temp.x);
            temp = temp.next;
        }
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
