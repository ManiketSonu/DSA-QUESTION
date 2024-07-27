package Advanced_DSA.LinkedList.StriverLinkeListSerise;

import java.util.Stack;

public class ReverseKthNode {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = convertArrToLL(arr);
        head = solve(head, 3);
        print(head);
    }
    public static Node solve(Node head, int k)
    {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node temp = head;
        Stack<Node> st = new Stack<>();
        while(temp!=null)
        {
            int count = 0;
            Node curr = temp;
            while(count<k && temp!=null)
            {
                st.push(temp);
                temp = temp.next;
                count++;
            }
            if(count==k)
            {
                while (!st.isEmpty()) {
                    prev.next = st.pop();
                    prev = prev.next;
                }
                prev.next = temp;
            }
            else
            {
                prev.next = curr;
            }
        }
        return dummy.next;
    }
    public static Node convertArrToLL(int arr[])
    {
        if(arr.length==0)
        {
            return null;
        }
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
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
