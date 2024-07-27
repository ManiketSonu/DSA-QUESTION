package Advanced_DSA.LinkedList;

public class BreakLoop {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);
        Node k = new Node(11);
        Node l = new Node(12);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        j.next = k;
        k.next = l;
        l.next = f;
        Node breakNode = solve(a);
        if(breakNode!=null)
        {
            System.out.println("Loop broken at node with value: " + breakNode.x);
        }
        else
        {
            System.out.println("No loop found.");
        }
        print(a);
    }
    public static Node solve(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                break;
            }
        }
        if(fast==null || fast.next==null)
        {
            return null;
        }
        fast = head;
        while(slow!=fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
        return fast.next;
    }
    public static void print(Node x)
    {
        Node temp = x;
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