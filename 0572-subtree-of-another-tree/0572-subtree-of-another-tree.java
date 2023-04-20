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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        // Base case
        if (root == null) {
            return false;
        }
        
        // If the value matches check if it is identical
        if (root.val == subRoot.val) {
            if (isIdentical(root,subRoot))
                return true;
        }
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    public boolean isIdentical(TreeNode node, TreeNode subRoot) {
        
        // If they are both null return True
        if (node == null && subRoot == null) 
            return true;
        
        // If either of them is null or if value doesn't match return False
        if (node == null || subRoot == null || node.val != subRoot.val) 
            return false;
        
        return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
    }
}