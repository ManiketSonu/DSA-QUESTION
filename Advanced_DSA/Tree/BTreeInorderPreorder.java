package Advanced_DSA.Tree;

// import Interview.TreeNode;

public class BTreeInorderPreorder {
    public static void main(String[] args) {
        int arr[] = {2, 1, 3};
        int arr1[] = {2, 3, 1};
        
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length)
            return null;

        return solve(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }
    public static TreeNode solve(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd)
            return null;

        int rootValue = preorder[preStart];
        TreeNode root = new TreeNode(rootValue);

        int rootIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootValue) {
                rootIndex = i;
                break;
            }
        }

        int leftSubtreeSize = rootIndex - inStart;
        root.left = solve(preorder, inorder, preStart + 1, preStart + leftSubtreeSize, inStart, rootIndex - 1);
        root.right = solve(preorder, inorder, preStart + leftSubtreeSize + 1, preEnd, rootIndex + 1, inEnd);

        return root;
    }
}
