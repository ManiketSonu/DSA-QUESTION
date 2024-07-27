package Advanced_DSA.Tree.BinarSearchTree;

import java.util.ArrayList;

public class KthSmallestElementBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(-1);
        root.left.left = new TreeNode(-5);
        root.left.right = new TreeNode(1);
        root.left.right.right = new TreeNode(3);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(14);
        root.right.right.right = new TreeNode(15);
        System.out.println(kthsmallest(root, 5));
    }
    public static int kthsmallest(TreeNode A, int B)
    {
        ArrayList<Integer> list = new ArrayList<>();
        solve(A, list);
        return list.get(B-1);
    }
    public static void solve(TreeNode root, ArrayList<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        solve(root.left, list);
        list.add(root.val);
        solve(root.right, list);
    }
}
class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x)
    {
        val = x;
        left = null;
        right = null;
    }
}