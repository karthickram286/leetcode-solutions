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
    public List<List<Integer>> findLeaves(TreeNode root) {
        
        List<List<Integer>> leavesList = new ArrayList<>();
        
        // Remove the leaves until the root has no children
        while(root.left != null || root.right != null) {
            List<Integer> list = new ArrayList<>();
            removeLeaves(root, list);
            leavesList.add(list);
        } 
        
        // Add the root to the list at last
        leavesList.add(List.of(root.val));
        
        return leavesList;
    }
    
    private void removeLeaves(TreeNode root, List<Integer> list) {
        
        // Base case
        if (root == null)
            return;
        
        // If left has no children remove left
        if (root.left != null && root.left.left == null && root.left.right == null) {
            list.add(root.left.val);
            root.left = null;
        }
        
        // If right has no children remove right
        if (root.right != null && root.right.left == null && root.right.right == null) {
            list.add(root.right.val);
            root.right = null;
        }
        
        removeLeaves(root.left, list); 
        removeLeaves(root.right, list);
    }
}