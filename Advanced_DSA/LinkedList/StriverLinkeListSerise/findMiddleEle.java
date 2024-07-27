package Advanced_DSA.LinkedList.StriverLinkeListSerise;

public class findMiddleEle {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Node head = convertArrToLL(arr);
        head = sollve(head);
        System.out.println(head.data);
        // System.out.println(solve(head));
        // print(head);
    }
    // this is one pass solln and TC = O(n) and sc = O(1)
    public static Node sollve(Node head)
    {
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            temp =temp.next;
        }

        int middleNode = (count/2)+1;
        temp = head;
        while(temp!=null)
        {
            middleNode = middleNode-1;
            if(middleNode==0)
            {
                break;
            }
            temp = temp.next;
        }
        return temp;
    }

    //this is 2 pass solln TC = O(n+n/2) and SC = O(1)
    public static int solve(Node head)
    {
        Node slow = head;
        Node fast = head;
        while (fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next==null)
        {
            return slow.data;
        }
        else{
            return slow.next.data;
        }
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
