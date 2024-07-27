package Advanced_DSA.Tree;

import java.util.ArrayList;

// import Interview.TreeNode;

public class PostOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        ArrayList<Integer> res = solve(root);
        for(int i=0;i<res.size();i++)
        {
            System.out.println(res.get(i)+" ");
        }
    }
    public static ArrayList<Integer> solve(TreeNode A)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        helperMethod(A, list);
        return list;
    }
    public static void helperMethod(TreeNode root, ArrayList<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        helperMethod(root.left,list);
        helperMethod(root.right, list);
        list.add(root.val);
    }
}
