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
    public int rob(TreeNode root) {
        int[] result = maxMoney(root);
        
        return Math.max(result[0], result[1]);
    }
    
    // int[withRoot, withoutRoot]
    private int[] maxMoney(TreeNode root) {
        
        // Base case
        if (root == null) {
            return new int[2];
        }
        
        int[] left = maxMoney(root.left);
        int[] right = maxMoney(root.right);
        
        // Current value + withoutRoot values of subtrees
        int withRoot = root.val + left[1] + right[1];   
        
        // If current node is not included, then we need the max of pairs in both subtrees
        int withoutRoot = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        
        return new int[]{ withRoot, withoutRoot };
    }
}