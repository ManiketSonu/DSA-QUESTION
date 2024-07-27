package Advanced_DSA.LinkedList.StriverLinkeListSerise;

public class RmoveNthNodefromlast {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        int arr[] = {1,2};
        Node head = convertLLtoArray(arr);
        head = solve1(head, 2);
        print(head);
    }
    //TC will bw O(len)
    public static Node solve1(Node head, int n)
    {
        Node fast = head;
        for(int i=0;i<n;i++)
        {
            fast = fast.next;
        }
        Node slow = head;
        while(fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    //TC will be 2*len
    public static Node solve(Node head, int n)
    {
        if(head ==null)
        {
            return null;
        }

        int count = 0;
        Node temp = head;

        while (temp!=null) {
            count++;
            temp = temp.next;
        }

        if(count==n)
        {
            return head.next;
        }
        int res = count-n-1;
        temp = head;
        while(res>0)
        {
            temp = temp.next;
            res--;
        }
        temp.next = temp.next.next;
        return head;
    }
    public static Node convertLLtoArray(int arr[])
    {
        int n = arr.length;
        if(n==0)
        {
            return null;
        }
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