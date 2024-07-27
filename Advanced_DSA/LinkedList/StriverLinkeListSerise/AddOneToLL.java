package Advanced_DSA.LinkedList.StriverLinkeListSerise;

import java.util.Stack;

public class AddOneToLL {
    public static void main(String[] args) {
        int arr[] = {1,5,9};
        Node head = convertArrtoLL(arr);
        // head = solve(head);
        head = fun(head);
        print(head);
    }
    //with resursive approach optmising time complexity
    public static Node fun(Node head)
    {
        int carry = helper(head);
        if(carry==1)
        {
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }
    public static int helper(Node head)
    {
        if(head==null)
        {
            return 1;
        }
        int carry = helper(head.next);
        head.data = head.data+carry;
        if(head.data<10)
        {
            return 0;
        }
        head.data = 0;
        return 1;
    }
    //without recursive approach (TC=O(3n) and SC=O(n))
    public static Node solve(Node head)
    {
        head = reverse(head);
        Node temp = head;
        int carry = 1;
        while(temp!=null)
        {
            temp.data = temp.data+carry;
            if(temp.data<10)
            {
                carry = 0;
                break;
            }
            else
            {
                temp.data = 0;
                carry = 1;
            }
            temp = temp.next;
        }

        if(carry == 1)
        {
            Node newNode = new Node(1);
            head = reverse(head);
            newNode.next = head;
            return newNode;
        }
        head = reverse(head);
        return head;
    }
    public static Node reverse(Node head)
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
    public static  Node convertArrtoLL(int arr[])
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
class Node{
    int data;
    Node next;
    Node back;
    Node(int data1, Node next1, Node back1)
    {
        this.data = data1;
        this.next = next1;
        this.next = back1;
    }
    Node(int data1)
    {
        data = data1;
        next = null;
        back = null;
    }
}
