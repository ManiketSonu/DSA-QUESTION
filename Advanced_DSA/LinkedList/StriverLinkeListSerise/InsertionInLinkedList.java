package Advanced_DSA.LinkedList.StriverLinkeListSerise;

public class InsertionInLinkedList {
    public static void main(String[] args) {
        int arr[] = {12, 5, 6, 8};
        Node head = ConverIntoArray(arr);
        head = inserBeforeValue(head, 100, 5);
        print(head);
    }
    //Insert at head..
    // public static Node insertAtHead(Node head, int val)
    // {
    //     return new Node(val, head);
    // }

    //Insert at tail..
    public static Node insertAtTail(Node head, int val)
    {
        if(head==null)
        {
            return new Node(val);
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    //Insert at position
    public static Node insertAtPosition(Node head, int ele, int k)
    {
        if(head==null)
        {
            if(k==1)
            {
                return new Node(ele);
            }
            else
            {
                return head;
            }
        }
        if(k==1)
        {
            return new Node(ele, head);
        }
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            if(count==k-1)
            {
                Node x = new Node(ele, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    //Insert Before Value
    public static Node inserBeforeValue(Node head, int ele, int val)
    {
        if(head==null)
        {
            return null;
        }
        if(head.data==val)
        {
            return new Node(ele, head);
        }
        Node temp = head;
        while(temp!=null)
        {
            if(temp.next.data==val)
            {
                Node x = new Node(ele, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static Node ConverIntoArray(int arr[])
    {
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=0;i<n;i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
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
