package Advanced_DSA.LinkedList.StriverLinkeListSerise.DoublyLinkedList;

public class InsertionInDLL {
    public static void main(String[] args) {
        int arr[] = {12,5,8,7};
        Node head = converArr2DLL(arr);
        // head = insertbeforetail(head, 10);
        // head = insertatkthEle(head, 4, 10);
        solve(head.next.next, 100);
        print(head);
    }
    //Insertion at head
    public static Node insertbeforehead(Node head, int val)
    {
        Node newhead = new Node(val, head, null);
        head.back = newhead;
        return newhead;
    }

    //Insertion Before tail
    public static Node insertbeforetail(Node head, int val)
    {
        if(head.next==null)
        {
            return insertbeforehead(head, val);
        }
        Node tail = head;
        while(tail.next!=null)
        {
            tail = tail.next;
        }

        Node prev = tail.back;
        Node newNode = new Node(val, tail, prev);
        prev.next = newNode;
        tail.back = newNode;
        return head;
    }
    //Insertion at kth element
    public static Node insertatkthEle(Node head, int k, int val)
    {
        if(k==1)
        {
            return insertbeforehead(head, val);
        }
        Node temp = head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            if(count==k)
            {
                break;
            }
            temp = temp.next;
        }

        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }
    //Insert Before the given Node
    public static void solve(Node head, int val)
    {
        Node prev = head.back;
        Node newNode = new Node(val, head, prev);
        prev.next = newNode;
        prev.back = newNode;
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