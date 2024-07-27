package Advanced_DSA.LinkedList.StriverLinkeListSerise.DoublyLinkedList;

import java.util.Stack;

public class reverseDLL {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Node head = convertLLtoArray(arr);
        head = reverseDLLLl(head);
        print(head);
    }
    //TC will be O(2n) and SC will be O(n)
    public static Node reverseDLLL(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while(temp!=null)
        {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp!=null && !st.isEmpty())
        {
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }
    //solve using one itreation
    public static Node reverseDLLLl(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node prev = null;
        Node current = head;
        while (current!=null) {
            prev = current.back;
            current.back = current.next;
            current.next = prev;
            current = current.back;
        }
        return prev.back;
    }
    public static Node convertLLtoArray(int arr[])
    {
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<n;i++)
        {
            Node temp = new Node(arr[i], null, prev);
            prev.next  = temp;
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
