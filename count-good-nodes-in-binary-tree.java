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
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        return helper(root, root.val,0);
    }
    
    public int helper(TreeNode root, int val, int count){
        if(root == null) return count;
        
        if (root.val >= val) ++count;
        count = helper(root.left, Math.max(root.val, val), count);
        count = helper(root.right, Math.max(root.val, val), count);
        return count;
    }
}