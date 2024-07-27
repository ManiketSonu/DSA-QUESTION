package Advanced_DSA.Tree.BinarSearchTree;

public class EqualTree_Partition {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        
        System.out.println(checkItcanBePartition(root));
    }
    public static int Sum(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return root.val+Sum(root.left)+Sum(root.right);
    }
    public static int checkItcanBePartition(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int totalSum = Sum(root);
        if(totalSum%2==1)
        {
            return 0;
        }
        return ifSubTreeExistWithSum(root,totalSum/2);
    }
    public static int ifSubTreeExistWithSum(TreeNode root, int target)
    {
        if(root==null)
        {
            return 0;
        }
        int leftSum = Sum(root.left);
        int rightSum = Sum(root.right);
        if (root.val + leftSum == target || root.val + rightSum == target || ifSubTreeExistWithSum(root.left, target) == 1 || ifSubTreeExistWithSum(root.right, target) == 1) 
        {
            return 1;
        } 
        else 
        {
            return 0;
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
