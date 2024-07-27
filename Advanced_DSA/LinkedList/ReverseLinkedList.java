package Advanced_DSA.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        reverse(a);
        print(d);
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
        // return prev;
    }
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