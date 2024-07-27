package Advanced_DSA.Tree.BinarSearchTree;

public class BalancedSortedBST {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 10};
        TreeNode res = solve(arr);
        printInorder(res);
    }
    public static TreeNode solve(int arr[])
    {
        int n = arr.length;
        TreeNode result = constructBST(arr, 0, n-1);
        return result;
    }
    public static TreeNode constructBST(int arr[], int l, int r)
    {
        if(l>r)
        {
            return null;
        }
        int mid = (l+r)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = constructBST(arr, l, mid-1);
        root.right = constructBST(arr, mid+1, r);
        return root;
    }
    public static void printInorder(TreeNode root) {
        if(root == null)
            return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
}
