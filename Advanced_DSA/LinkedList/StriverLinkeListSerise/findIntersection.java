package Advanced_DSA.LinkedList.StriverLinkeListSerise;

import java.util.HashSet;

public class findIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 3, 4, 5};
        
        // Convert arrays to linked lists
        Node headA = convertArrToLL(arr1);
        Node headB = convertArrToLL(arr2);
        
        // Find intersection node
        Node intersectionNode = intersection(headA, headB);
        if(intersectionNode != null) {
            System.out.println(intersectionNode.data);
        } else {
            System.out.println("kuch nahi hai bhai");
        }
    }

    //optmise with timeO(n) and space complexityO(1)
    public static Node solve1(Node headA, Node headB)
    {
        Node temp1 = headA;
        Node temp2 = headB;
        while(temp1!=temp2)
        {
            if(temp1==null)
            {
                temp1 = headB;
            }
            else
            {
                temp1 = temp1.next;
            }
            if(temp2==null)
            {
                temp2 = headA;
            }
            else
            {
                temp2 = temp2.next;
            }
        }
        return temp1;
    }

    //time complexity O(2n) and space is O(n)
    public static Node intersection(Node headA, Node headB)
    {
        HashSet<Node> hs = new HashSet<>();
        Node temp1 = headA;
        while(temp1!=null)
        {
            hs.add(temp1);
            temp1 = temp1.next;
        }

        Node temp2 = headB;
        while(temp2!=null)
        {
            if(hs.contains(temp2))
            {
                return temp2;
            }
            temp2 = temp2.next;
        }
        return null;
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