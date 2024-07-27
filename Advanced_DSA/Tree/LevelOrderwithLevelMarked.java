package Advanced_DSA.Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderwithLevelMarked {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        solve(root);
    }

    private static void solve(TreeNode root) 
    {
       if(root==null)
       {
            return;
       }
       Queue<TreeNode> qu = new ArrayDeque<>();
       qu.add(root);
       while(!qu.isEmpty())
       {
            TreeNode x = qu.remove();
            if(x==null)
            {
                System.out.println();
                qu.add(null);
                continue;
            }
            System.out.println(x.val);
            if(x.left!=null)
            {
                qu.add(x.left);
            }
            if(x.right!=null)
            {
                qu.add(x.right);
            }
       }
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) 
    {
        val = x;
    }
}
