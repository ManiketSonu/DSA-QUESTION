package Advanced_DSA.LinkedList.StriverLinkeListSerise;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1};
        Node head = convertLLtoArray(arr);
        int result = palindrome(head);
    
        if(result == 1) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
    public static int palindrome(Node head)
    {
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while(temp!=null)
        {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp!=null)
        {
            if(temp.data!=st.pop())
            {
                return 0;
            }
            temp = temp.next;
        }
        return 1;
    }
    public static Node convertLLtoArray(int arr[])
    {
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<n;i++)
        {
            Node temp = new Node(arr[i]);
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
    // Node back;
    // Node(int data1, Node next1, Node back1)
    // {
    //     this.data = data1;
    //     this.next = next1;
    //     this.back = back1;
    // }
    Node(int data1)
    {
        data = data1;
        next = null;
        // back = null;
    }
}
