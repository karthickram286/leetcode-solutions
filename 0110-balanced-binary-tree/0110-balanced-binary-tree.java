/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        
        return (
            Math.abs(height(root.left) - height(root.right)) < 2    // Checking if the absolute difference of left and right subtrees isn't more than 2
            && isBalanced(root.left)                                // Also checking if the left subtree satisfies this property    
            && isBalanced(root.right)                               // Also checking if the right subtree satisfies this property
        );
    }
    
    public int height(TreeNode root) {
        
        // Base case
        if (root == null)
            return 0;
        
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}