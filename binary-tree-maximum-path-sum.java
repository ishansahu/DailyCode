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
    int res ;
    public int maxPathSum(TreeNode root) {
        res = root.val;
        helper(root);
        return res;
    }
    public int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        res = Math.max(res, root.val + left + right);
        
        return  Math.max(root.val + left, root.val + right) > 0?  Math.max(root.val + left, root.val + right): 0;
    }
        
}