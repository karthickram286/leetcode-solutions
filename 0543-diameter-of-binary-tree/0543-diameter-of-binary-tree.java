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
    int maxDiameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return (maxDiameter == 0) ? 0 : maxDiameter - 1;
    }
    
    private int diameter(TreeNode root) {
        
        // Base case
        if (root == null)
            return 0;
        
        int leftDepth = diameter(root.left);
        int rightDepth = diameter(root.right);
        
        // Calculating the diameter of this current node
        int diameter = leftDepth + rightDepth + 1;
        // If this is greater than the maxdiameter, then this is the maxdiamter
        maxDiameter = Math.max(maxDiameter, diameter);
        
        // Returning only the max of left or right depths. Because the parent of this node only cares about the max of depths
        return Math.max(leftDepth, rightDepth) + 1;
    }
}