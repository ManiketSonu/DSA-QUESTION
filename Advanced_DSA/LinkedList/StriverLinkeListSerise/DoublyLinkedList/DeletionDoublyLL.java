package Advanced_DSA.LinkedList.StriverLinkeListSerise.DoublyLinkedList;

public class DeletionDoublyLL {
    public static void main(String[] args) {
        int arr[] = {12,5,7,8};
        Node head = converArr2DLL(arr);
        // head = DeleteTail(head);
        // head = deleteKthEle(head, 2);
        deletNode(head.next);
        print(head);
    }

    //Delete Head
    public static Node DeleteAtHead(Node head)
    {
        if(head==null || head.next==null)
        {
            return null;
        }
        Node prev = head;
        head = head.next;

        head.back = null;
        prev.next = null;

        return head;
    }

    //Delete tail
    public static Node DeleteTail(Node head)
    {
        if(head==null || head.next == null)
        {
            return null;
        }

        Node tail = head;
        while(tail.next!=null)
        {
            tail = tail.next;
        }
        Node newTail = tail.back;
        newTail.next = null;
        tail.back = null;

        return head;
    }

    //Delete kth element..
    public static Node deleteKthEle(Node head, int k)
    {
        if(head==null)
        {
            return null;
        }
        int count = 0;
        Node kNode = head;
        while(kNode!=null)
        {
            count++;
            if(count==k)
            {
                break;
            }
            kNode = kNode.next;
        }
        Node prev = kNode.back;
        Node front = kNode.next;
        if(prev==null && front==null)
        {
            return null;
        }
        else if(prev==null)
        {
            return DeleteAtHead(head);
        }
        else if(front==null)
        {
            return DeleteTail(head);
        }
        prev.next = front;
        front.back = prev;

        kNode.next = null;
        kNode.back = null;
        return head;
    }
    
    //Delete Node 
    public static void deletNode(Node temp)
    {
        Node prev = temp.back;
        Node front  = temp.next;

        if(front==null)
        {
            prev.next = null;
            temp.back = null;
            return;
        }

        prev.next = front;
        front.back = prev;

        temp.next = temp.back=null;
    }
    public static Node converArr2DLL(int arr[])
    {
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<n;i++)
        {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
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
    }
}
class Node
{
    int data;
    Node next;
    Node back;
    Node(int data1, Node next1, Node back1)
    {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
    Node(int data1)
    {
        data = data1;
        next = null;
        back = null;
    }
}
