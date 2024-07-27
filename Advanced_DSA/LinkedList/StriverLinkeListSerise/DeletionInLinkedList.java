package Advanced_DSA.LinkedList.StriverLinkeListSerise;

public class DeletionInLinkedList {
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,4,5};
        Node head = converArrtoLinkedL(arr);
        head = removerNthNodeEle(head, 6);
        print(head);
    }
    
    //remove head of the linkedlist
    // public static Node removeHead(Node head)
    // {
    //     if(head==null)
    //     {
    //         return null;
    //     }
    //     head = head.next;
    //     return head;
    // }

    // public static Node removeTail(Node head)
    // {
    //     if(head==null || head.next==null)
    //     {
    //         return null;
    //     }
    //     Node temp = head;
    //     while(temp.next.next!=null)
    //     {
    //         temp = temp.next;
    //     }
    //     temp.next = null;
    //     return head;
    // }

    //Remove k element from the linkedlist
    // public static Node removerNthNode(Node head, int k)
    // {
    //     if(head==null)
    //     {
    //         return head;
    //     }
    //     if(k==1)
    //     {
    //         return head;
    //     }
    //     int count = 0;
    //     Node temp = head;
    //     Node prev = null;
    //     while (temp!=null) {
    //         count++;
    //         if(count==k)
    //         {
    //             prev.next = prev.next.next;
    //             break;
    //         }
    //         prev = temp;
    //         temp = temp.next;
    //     }
    //     return head;
    // }
    public static Node removerNthNodeEle(Node head, int k)
    {
        if(head==null)
        {
            return head;
        }
        if(head.data==1)
        {
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp!=null) {
            if(temp.data==k)
            {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static Node converArrtoLinkedL(int arr[])
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