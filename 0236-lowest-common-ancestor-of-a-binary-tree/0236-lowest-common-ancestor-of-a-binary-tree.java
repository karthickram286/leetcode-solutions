/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        // Base case
        if (root == null)
            return null;
        
        // If the current node is either p or q, return it
        if (root.val == p.val || root.val == q.val)
            return root;
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both left and right of the current node isn't null, then it means
        // the current node is the LCA of p and q
        if (left != null && right != null)
            return root;
        
        // The LCA can be an direct parent of the node
        // Then either left or right of root can be null
        return (left != null) ? left : right;
    }
}