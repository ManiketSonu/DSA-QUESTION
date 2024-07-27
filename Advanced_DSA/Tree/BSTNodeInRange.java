package Advanced_DSA.Tree;

// import Interview.TreeNode;

public class BSTNodeInRange {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(12);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(10);
        root.left.left.left = new TreeNode(8);
        root.left.right = new TreeNode(14);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(27);

        int B = 12;
        int C = 20;
        System.out.println(solve(root, B, C));
    }
    public static int solve(TreeNode A, int B, int C)
    {
        if(A==null)
        {
            return 0;
        }
        if(A.val<B)
            return solve(A.right, B, C);
        else if(A.val>C)
            return solve(A.left, B, C);
        else
            return 1+solve(A.left, B, C)+solve(A.right, B, C);
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