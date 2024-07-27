package Advanced_DSA.LinkedList;

public class InsertAtMiddle {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        solve(a, 3);
        printtt(a);
    }
    public static void solve(Node head, int position)
    {
        Node f = new Node(6);
        Node curr = head;
        for(int i=0;i<position-1;i++)
        {
            curr = curr.next;
        }
        Node temp = curr.next;
        curr.next = f;
        f.next = temp;
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
    }
}
