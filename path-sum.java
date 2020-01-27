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
    public boolean hasPathSum(TreeNode root, int sum) {
        return helper(root, sum, 0);
    }
    
    public boolean helper(TreeNode root, int sum, int currsum){
        if(root == null) return false;
        int temp = root.val + currsum;
        if(temp == sum && root.left == null && root.right == null) return true;
        return helper(root.left, sum, temp) || helper(root.right, sum, temp);
        
    }
    
}