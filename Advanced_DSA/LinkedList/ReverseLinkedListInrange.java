package Advanced_DSA.LinkedList;

public class ReverseLinkedListInrange {
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
        reverinrange(a, 2, 4);
        print(e);
    }
    public static void reverinrange(Node A, int B, int C)
    {
        for(int i=B;i<=C;i++)
        {
            reverse(A);
        }
    }
    public static void reverse(Node head)
    {
        Node curr = head;
        Node prev = null;
        while(curr!=null)
        {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
    }
    public static void print(Node x)
    {
        Node temp = x;
        while(temp!=null)
        {
            System.out.print(temp.x+" ");
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
