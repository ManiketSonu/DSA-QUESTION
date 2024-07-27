package Advanced_DSA.LinkedList.StriverLinkeListSerise;

public class SearchinginLinkedList {
    public static void main(String[] args) {
        int arr[] = {12,5,6,8};
        Node head = solve1(arr);
        System.out.println(solve(head, 5));
    }
    public static Node solve1(int arr[])
    {
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<n;i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static int solve(Node head, int k)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data==k)
            {
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
}
class Node
{
    int data;
    Node next;
    Node(int data1, Node next1)
    {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1)
    {
        this.data = data1;
        this.next = null;
    }
}