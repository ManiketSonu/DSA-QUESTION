package Advanced_DSA.Tree.BinarSearchTree;

import java.util.ArrayList;

public class ValidateBST {
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

        ArrayList<Integer> list = new ArrayList<>();
        helperMethod(root, list);

        boolean isValid = true;
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)>=list.get(i+1))
            {
                isValid = false;
                break;
            }
        }
        System.out.println(isValid);
    }
    //solve using Inorder traversal...
    public static void helperMethod(TreeNode root, ArrayList<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        helperMethod(root.left, list);
        list.add(root.val);
        helperMethod(root.right, list);
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