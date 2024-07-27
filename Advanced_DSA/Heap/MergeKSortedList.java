package Advanced_DSA.Heap;

import java.util.ArrayList;

public class MergeKSortedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(10);
        list1.next.next = new ListNode(20);

        ListNode list2 = new ListNode(4);
        list2.next = new ListNode(11);
        list2.next.next = new ListNode(13);

        ListNode list3 = new ListNode(3);
        list3.next = new ListNode(8);
        list3.next.next = new ListNode(9);

        ArrayList<ListNode> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        
        MergeKSortedList sol = new MergeKSortedList();
        ListNode result = sol.solve(lists);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public ListNode solve(ArrayList<ListNode> list)
    {
        if (list == null || list.size() == 0)
            return null;
        return mergelist(list, 0, list.size() - 1);
    }
    public ListNode mergelist(ArrayList<ListNode> list, int start, int end)
    {
        if(start==end)
        {
            return list.get(start);
        }
        int mid = start+(end-start)/2;
        ListNode left = mergelist(list, start, mid);
        ListNode right = mergelist(list, mid+1, end);
        return merge(left, right);
    }
    public ListNode merge(ListNode left, ListNode right)
    {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        while (left != null && right != null) 
        {
            if (left.val < right.val) 
            {
                temp.next = left;
                left = left.next;
            } 
            else 
            {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        if (left != null)
            temp.next = left;
        if (right != null)
            temp.next = right;
        return head.next;
    }
}
class ListNode
{
    int val;
    ListNode next;
    ListNode(int x)
    {
        val = x;
        next = null;
    }
}
