package Advanced_DSA.LinkedList.StriverLinkeListSerise;

import java.util.HashMap;

public class findlengthOfTheLoop {
    public static void main(String[] args) {
        int arr[] = {1,2,15,4,13,6,7,8,9};
        Node head = convertArrToLL(arr);
        createLoop(head, 2);
        // int res = solve(head);
        int res = solve1(head);
        System.out.print(res);
    }
    //optmise this using tortise and here algo (slow and fast)
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
                return findlen(slow, fast);
            }
        }
        return 0;
    }
    public static int findlen(Node slow, Node fast)
    {
        int count = 1;
        fast =fast.next;
        while(slow!=fast)
        {
            count++;
            fast = fast.next;
        }
        return count;
    }
    //Knive approach with TC O(2*logn) and sc O(n)
    public static int solve(Node head)
    {
        if(head==null)
        {
            return 0;
        }
        HashMap<Node, Integer> hs = new HashMap<>();
        Node temp = head;
        int timer = 1;
        while (temp!=null) {
            if(hs.containsKey(temp))
            {
                int value = hs.get(temp);
                return timer-value;
            }
            hs.put(temp, timer);
            timer++;
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