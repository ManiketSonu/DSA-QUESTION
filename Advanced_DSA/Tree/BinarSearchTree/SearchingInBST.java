package Advanced_DSA.Tree.BinarSearchTree;

public class SearchingInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        int result = solve(root, 8);
        System.out.print(result);
    }
    public static int solve(TreeNode root, int B)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.val==B)
        {
            return 1;
        }
        if(root.val>B)
        {
            return solve(root.left, B);
        }
        if(root.val<B)
        {
            return solve(root.right, B);
        }
        return 1;
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