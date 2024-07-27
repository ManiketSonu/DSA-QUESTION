package Advanced_DSA.LinkedList;

public class MidElementinLL {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(2);
        Node e = new Node(3);
        Node f = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        System.out.println(solve(a));
        // print(a);
    }
    public static int solve(Node A)
    {
        Node slow = A;
        Node fast = A;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next==null)
        {
            return slow.x;
        }
        else
        {
            return slow.next.x;
        }
    }
    public static void print(Node A)
    {
        Node temp = A;
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
