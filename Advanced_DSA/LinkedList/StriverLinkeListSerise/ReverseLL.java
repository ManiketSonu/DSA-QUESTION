package Advanced_DSA.LinkedList.StriverLinkeListSerise;

import java.util.Stack;

public class ReverseLL {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = convertArrtoLL(arr);
        head = reverseLLL(head);
        print(head);
    }
    //In O(n)
    public static Node reverseLLL(Node head)
    {
        Node temp = head;
        Node prev = null;
        while(temp!=null)
        {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public static Node reverseLL(Node head)
    {
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return head;
        }

        Node temp = head;
        Stack<Integer> st = new Stack<>();
        while (temp!=null) {
            st.push(temp.data);
            temp= temp.next;
        }

        temp = head;
        while (temp!=null && !st.isEmpty()) {
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }
    public static Node convertArrtoLL(int arr[])
    {
        int n = arr.length;
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
