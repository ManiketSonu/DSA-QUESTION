package Interview;

public class oddlevelevellevelDiff {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(7);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(11);
        root.right.right.left = new TreeNode(4);
        System.out.print(solve(root, 0));
    }
    public static int solve(TreeNode root, int level)
    {
        return helper(root, 0);
    }
    public static int helper(TreeNode root, int level)
    {
        if(root==null)
        {
            return 0;
        }
        if(level%2==0)
        {
            return root.val+helper(root.left, level+1)+helper(root.right, level+1);
        }
        else
        {
            return helper(root.left, level+1)+helper(root.right, level+1)-root.val;
        }
    }
}
class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val)
    {
        val = val;
    }
}