package Advanced_DSA.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// import Interview.TreeNode;

public class PrintRightViewSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-11);
        root.left = new TreeNode(4);
        root.right = new TreeNode(7);
        root.left.right = new TreeNode(-3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(-2);
        root.right.left.left = new TreeNode(3);
        root.right.left.right = new TreeNode(2);

        int result = solve(root);
        System.out.println(result);
    }
    public static int solve(TreeNode A)
    {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        q.add(null);
        while(q.size()>1)
        {
            TreeNode x = q.remove();
            if(x==null)
            {
                q.add(null);
                continue;
            }
            if(q.peek()==null)
            {
                res.add(x.val);
            }
            if(x.left!=null)
            {
                q.add(x.left);
            }
            if(x.right!=null)
            {
                q.add(x.right);
            }
        }
        int sum = 0;
        for(int i=0;i<res.size();i++)
        {
            sum = sum+res.get(i);
        }
        return sum;
    }
}
