package Advanced_DSA.LinkedList.StriverLinkeListSerise;

public class SortZerOnesTwo {
    public static void main(String[] args) {
        int arr[] = {1,0,1,2,0,2,1};
        Node head = convertLLtoArray(arr);
        head = sorttt(head);
        print(head);
    }
    //optmise the time complexity and do it in one pass
    public static Node sorttt(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;
        while(temp!=null)
        {
            if(temp.data == 0)
            {
                zero.next = temp;
                zero = temp;
            }
            else if(temp.data == 1)
            {
                one.next = temp;
                one = temp;
            }
            else
            {
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        zero.next = oneHead.next;

        one.next = twoHead.next;
        
        two.next = null;
        Node newNodee = zeroHead.next;
        return newNodee;
    }
    //Brute foce solln O(2n) and O(1)
    public static Node sortt(Node head)
    {
        Node temp = head;
        int count0 = 0, count1 = 0, count2 = 0;
        while(temp!=null)
        {
            if(temp.data==0)
            {
                count0++;
            }
            else if(temp.data==1)
            {
                count1++;
            }
            else
            {
                count2++;
            }
            temp = temp.next;
        }

        temp = head;
        while(temp!=null)
        {
            if (count0>0) 
            {
                temp.data = 0;
                count0--;
            }
            else if(count1>0)
            {
                temp.data = 1;
                count1--;
            }
            else
            {
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }

        return head;

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
