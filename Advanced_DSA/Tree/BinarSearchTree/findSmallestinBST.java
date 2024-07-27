package Advanced_DSA.Tree.BinarSearchTree;

public class findSmallestinBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode result = solve(root);
        System.out.print(result.val);
    }
    public static TreeNode solve(TreeNode root)
    {
        TreeNode curr = root;
        while(curr.left!=null)
        {
            curr = curr.left;
        }
        return curr;
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
