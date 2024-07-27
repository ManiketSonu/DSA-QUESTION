package Advanced_DSA.LinkedList;

public class Palindrome {
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(3);
        Node d = new Node(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        System.out.println(isPlindrome(a));
    }
    public static boolean isPlindrome(Node A)
    {
        if(A==null || A.next==null)
        {
            return true;
        }

        int count = findLen(A);
        int half = (count-1)/2;
        Node curr = A;
        for(int i=0;i<half;i++)
        {
            curr = curr.next;
        }

        Node head2 = curr.next;
        curr.next = null;
        head2 = reverse(head2);

        Node curr1 = A;
        Node curr2 = head2;
        while(curr1!=null && curr2!=null)
        {
            if(curr1.x!=curr2.x)
            {
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return true;
    }
    public static Node reverse(Node head)
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
        return prev;
    }
    public static int findLen(Node head)
    {
        int count = 0;
        Node curr = head;
        while(curr!=null)
        {
            curr = curr.next;
            count++;
        }
        return count;
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
