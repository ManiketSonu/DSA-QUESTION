package Advanced_DSA.LinkedList;

public class Merge_Two_SortedLL {
    public static void main(String[] args) {
        Node A = new Node(5);
        A.next = new Node(8);
        A.next.next = new Node(20);

        Node B = new Node(4);
        B.next = new Node(11);
        B.next.next = new Node(15);

        Node merge = solve(A, B);
        printList(merge);
    }
    public static Node solve(Node A, Node B)
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
            System.out.println(temp.x+" ");
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
