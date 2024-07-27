package Advanced_DSA.LinkedList;

public class SortLinkedL {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(7);
        Node c = new Node(0);
        Node d = new Node(5);
        Node e = new Node(2);
        Node f = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        Node sorted = sorttt(a);
        printList(sorted);
    }
    public static Node midd(Node x)
    {
        Node slow = x;
        Node fast = x;
        Node prevSlow = null;
        while(fast!=null && fast.next!=null)
        {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast==null)
        {
            return prevSlow;
        }
        else
        {
            return slow;
        }
    }
    public static Node sorttt(Node A)
    {
        if(A==null || A.next==null)
        {
            return A;
        }
        Node mid = midd(A);
        Node h2 = mid.next;
        if(h2!=null)
        {
            mid.next = null;
        }
        Node sortedA = sorttt(A);
        Node sortedH2 = sorttt(h2);
        return merge(sortedA, sortedH2);
    }
    public static Node merge(Node A, Node B)
    {
        Node h3 = new Node(-1);
        Node tail = h3;
        while(A!=null && B!=null)
        {
            if(A.x<=B.x)
            {
                tail.next = A;
                A=A.next;
            }
            else
            {
                tail.next = B;
                B=B.next;
            }
            tail = tail.next;
        }
        if(A==null)
        {
            tail.next = B;
        }
        else
        {
            tail.next = A;
        }
        return h3.next;
    }
    public static void printList(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.x);
            temp = temp.next;
        }
        System.out.println();
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
