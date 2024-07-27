package Advanced_DSA.LinkedList.StriverLinkeListSerise;

public class AddTwoNUmber {
    public static void main(String[] args) {
        // int arr[] = {2,4,3};
        int arr[] = {1};
        int arr1[] = {9,9,9};
        // int arr1[] = {5,6,4};
        Node head = convertLLtoArray(arr);
        Node head2 = convertLLtoArray(arr1);
        head = addTwoNumber(head, head2);
        print(head);
    }
    public static Node addTwoNumber(Node num1, Node num2)
    {
        Node dummyHead = new Node(-1);
        Node curr = dummyHead;
        Node temp1 = num1;
        Node temp2 = num2;
        int carry = 0;

        while(temp1!=null || temp2!=null)
        {
            int sum = carry;
            if(temp1 != null)
            {
                sum = sum+temp1.data;
                temp1 = temp1.next;
            }
            if(temp2!=null)
            {
                sum = sum+temp2.data;
                temp2 = temp2.next;
            }
            curr.next = new Node(sum%10);
            carry = sum/10;
            curr = curr.next;
        }

        if(carry>0)
        {
            curr.next = new Node(carry);
        }

        return dummyHead.next;
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
