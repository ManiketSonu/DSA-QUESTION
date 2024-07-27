package Advanced_DSA.LinkedList.StriverLinkeListSerise;

public class TraversalinLinkedList {
    public static void main(String[] args) {
        int arr[] = {12,5,6,8};
        Node head = solve(arr);
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static Node solve(int arr[])
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