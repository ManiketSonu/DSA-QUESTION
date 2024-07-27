package Advanced_DSA.LinkedList;

public class DeletionAtHead {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        a = deletion(a);
        print(a);
    }
    public static Node deletion(Node head)
    {
        Node newHead = head.next;
        head.next = null;
        return newHead;
    }
    // public static void print(Node x)
    // {
    //     Node temp = x;
    //     while(temp!=null)
    //     {
    //         System.out.println(temp.x);
    //         temp = temp.next;
    //     }
    // }
    public static void print(Node head)
    {
        Node temp = head;
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