package Advanced_DSA.LinkedList.StriverLinkeListSerise;

public class DeleteMidlleEle {
    public static void main(String[] args) {
        int arr[] = {1,3,4,7,1,2,6};
        Node head = convertLLtoArray(arr);
        head = solve(head);
        print(head);
    }
    public static Node solve(Node head)
    {
        Node temp = head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }

        if(count==1)
        {
            return null;
        }

        int mid = count/2;
        Node temp1 = head;
        for(int i=0;i<mid-1;i++)
        {
            temp1 = temp1.next;
        }
        temp1.next = temp1.next.next;
        return head;
    }
    public static Node convertLLtoArray(int arr[])
    {
        int n = arr.length;
        if(n==0)
        {
            return null;
        }
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<n;i++)
        {
            Node temp = new Node(arr[i]);
            prev.next  = temp;
            // temp.back = prev;
            prev = temp;
        }
        return head;
    }
    public static void print(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}
class Node{
    int data;
    Node next;
    Node(int data1, Node next1)
    {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1)
    {
        data = data1;
        next = null;
    }
}
