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
    public TreeNode pruneTree_ori(TreeNode root) {
        helper(root);
        return root;
    }
    
    public boolean helper(TreeNode root){
        if(root == null) return false;
        if(!helper(root.left)) root.left =null;
        if(!helper(root.right)) root.right =null;
        if(root.left == null && root.right == null && root.val ==0){
            root = null;
            return false;
        }
        return true;
            
    }
    
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.left == null && root.right == null && root.val == 0) return null;
        return root;
    }
    
}