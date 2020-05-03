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
    int sum;
    public int maxPathSum(TreeNode root) {
        sum=Integer.MIN_VALUE;
        helper(root);
        return sum;
    }
    
    public int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        left = left >0? left: 0;
        int right = helper(root.right);
        right = right >0 ? right :0;
        sum = Math.max(sum,root.val+left+right);
        return root.val + Math.max(left,right);
    }
    
}