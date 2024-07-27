package Advanced_DSA.Tree;

// import Interview.TreeNode;

public class ContructBinaryTreeUsingInorderAndPostOrderTraversal {
    public static void main(String[] args) {
        int arr[] = {2, 1, 3};
        int arr1[] = {2, 3, 1};
        
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) 
    {
        if (inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        
        return solve(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }
    private TreeNode solve(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd) 
    {
        if (inStart > inEnd || postStart > postEnd)
            return null;

        int rootValue = postorder[postEnd];
        TreeNode root = new TreeNode(rootValue);

        int rootIndex = -1;
        for (int i = inStart; i <= inEnd; i++) 
        {
            if (inorder[i] == rootValue) 
            {
                rootIndex = i;
                break;
            }
        }

        int leftSubtreeSize = rootIndex - inStart;
        root.left = solve(inorder, postorder, inStart, rootIndex - 1, postStart, postStart + leftSubtreeSize - 1);
        root.right = solve(inorder, postorder, rootIndex + 1, inEnd, postStart + leftSubtreeSize, postEnd - 1);

        return root;
    }
}
