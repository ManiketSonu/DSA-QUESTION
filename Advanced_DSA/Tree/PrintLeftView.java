package Advanced_DSA.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-11);
        root.left = new TreeNode(4);
        root.right = new TreeNode(7);
        root.left.right = new TreeNode(-3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(-2);
        root.right.left.left = new TreeNode(3);
        root.right.left.right = new TreeNode(2);

        ArrayList<Integer> leftView = solve(root);
        for(int i=0;i<leftView.size();i++)
        {
            System.out.print(leftView.get(i)+" ");
        }
    }
    public static ArrayList<Integer> solve(TreeNode A)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        q.add(null);
        TreeNode prev = null;
        while(q.size()>1)
        {
            TreeNode x = q.remove();
            if(x==null)
            {
                q.add(null);
                prev = x;
                continue;
            }
            if(prev==null)
            {
                res.add(x.val);
            }
            prev = x;
            if(x.left!=null)
            {
                q.add(x.left);
            }
            if(x.right!=null)
            {
                q.add(x.right);
            }
        }
        return res;
    }
}
class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
    val = x;
    left=null;
    right=null;
    }
}
// int size = q.size();
            // for (int i = 0; i < size; i++)
            // {
            //     TreeNode x = q.poll();
            //     if (i == 0) // For the leftmost node at each level
            //         res.add(x.val);
            //     if (x.left != null)
            //         q.add(x.left);
            //     if (x.right != null)
            //         q.add(x.right);
            // }