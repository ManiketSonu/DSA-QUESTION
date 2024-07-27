package Advanced_DSA.Tree.BinarSearchTree;

public class InsertionInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode res = solve(root, 7);
        inorderTraversal(res);
    }
    public static TreeNode solve(TreeNode root, int B)
    {
        if(root==null)
        {
            return new TreeNode(B);
        }
        if(root.val>B)
        {
            root.left = solve(root.left, B);
        }
        else
        {
            root.right = solve(root.right, B);
        }
        return root;
    }
    public static void inorderTraversal(TreeNode root)
    {
        if(root!=null)
        {
            inorderTraversal(root.left);
            System.out.println(root.val+" ");
            inorderTraversal(root.right);
        }
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
