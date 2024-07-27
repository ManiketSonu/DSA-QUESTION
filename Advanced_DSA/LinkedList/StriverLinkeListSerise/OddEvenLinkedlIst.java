package Advanced_DSA.LinkedList.StriverLinkeListSerise;

import java.util.ArrayList;

public class OddEvenLinkedlIst {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = convertLLtoArray(arr);
        // head = solve(head);
        head = solv1(head);
        print(head);
    }
    public static Node solv1(Node head)
    {
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        while(even!=null && even.next!=null)
        {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }
    public static Node solve(Node head) {
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;
        while(temp!=null && temp.next!=null) {
            arr.add(temp.data);
            temp = temp.next.next;
        }
        if(temp!=null) {
            arr.add(temp.data);
        }
        temp = head.next;
        while(temp!=null && temp.next!=null) {
            arr.add(temp.data);
            temp = temp.next.next;
        }
        if(temp!=null) {
            arr.add(temp.data);
        }

        int i = 0;
        temp = head;
        while (temp!=null) {
            temp.data = arr.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }

    public static Node convertLLtoArray(int arr[]) {
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<n;i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            // temp.back = prev;
            prev = temp;
        }
        return head;
    }

    public static void print(Node head) {
        while(head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
class Node1 {
    int data;
    Node next;
    Node back;

    Node1(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node1(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}