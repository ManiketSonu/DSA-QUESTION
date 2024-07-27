package Advanced_DSA.LinkedList.StriverLinkeListSerise;

import java.util.HashMap;

public class DetectLoopInLL {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Node head = convertArrToLL(arr);
        createLoop(head, 4);
        // int res = solve(head);
        int res = solve1(head);
        System.out.println(res);
    }
    //Optmise with space complexity O(1) and TC O(n)
    public static int solve1(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                return 1;
            }
        }
        return 0;
    }
    //Knive approach with TC O(n) and SC O(n)
    public static int solve(Node head)
    {
        HashMap<Node, Integer> hs = new HashMap<>();
        Node temp = head;
        while(temp!=null)
        {
            if(hs.containsKey(temp))
            {
                return 1;
            }
            hs.put(temp, 1);
            temp = temp.next;
        }
        return 0;
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
            prev = temp;
        }
        return head;
    }
    public static void createLoop(Node head, int index) {
        if (head == null) {
            return;
        }
        Node loopNode = head;
        Node endNode = head;
        for (int i = 0; i < index; i++) {
            if (loopNode != null) {
                loopNode = loopNode.next;
            }
        }
        while (endNode.next != null) {
            endNode = endNode.next;
        }
        endNode.next = loopNode; // Creating a loop
    }
    public static void print(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data);
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