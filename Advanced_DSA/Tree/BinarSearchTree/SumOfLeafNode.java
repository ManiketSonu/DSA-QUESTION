package Advanced_DSA.Tree.BinarSearchTree;

public class SumOfLeafNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        SumOfLeafNode tree = new SumOfLeafNode();
        int sum = tree.solve(root);
        System.out.println(sum);
    }
    public static int solve(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return root.val;
        }
        return solve(root.left)+solve(root.right);
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
    }
}