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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return null;
        helper(root, val);
        return root;
    }
    
    public void helper(TreeNode root, int val){
        if(val<root.val){
            if(root.left == null) root.left = new TreeNode(val);
            else helper(root.left, val);
        }
        else{
          if(root.right == null) root.right = new TreeNode(val);
          else helper(root.right, val);  
        } 
    }
    
}