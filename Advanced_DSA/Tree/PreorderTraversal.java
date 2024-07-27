package Advanced_DSA.Tree;

import java.util.ArrayList;

public class PreorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);


        // int preorderres[] = solve(root);
        // for(int i=0;i<preorderres.length;i++)
        // {
        //     System.out.print(preorderres[i]+" ");
        // }
        // PreorderTraversal sol = new PreorderTraversal();
        // int preorderresult[] = sol.solve(root);
        // for (int val : preorderresult) {
        //     System.out.print(val + " ");
        // }
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
        list.add(root.val);
        helperMethod(root.left,list);
        helperMethod(root.right, list);
    }
    // public static int[] solve(TreeNode A)
    // {
    //    if(A==null)
    //    {
    //     return new int[0];
    //    }
    //    int result[] = new int[countNode(A)];
    //    preorder(A, result, new int[]{0});
    //    return result;
    // }

    // // Helper method to perform preorder traversal
    // public static void preorder(TreeNode node, int result[], int index[])
    // {
    //     if(node==null)
    //     {
    //         return;
    //     }
    //     result[index[0]++] = node.val;
    //     preorder(node.left, result, index);
    //     preorder(node.right, result, index);
    // }

    // // Helper method to count the number of nodes in the tree
    // public static int countNode(TreeNode node)
    // {
    //     if(node==null)
    //     {
    //         return 0;
    //     }
    //     return 1+countNode(node.left)+countNode(node.right);
    // }

    //Index wrapper class to hold index value
    // private static class IndexWrapper 
    // {
    //     int index = 0;
    // }
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
