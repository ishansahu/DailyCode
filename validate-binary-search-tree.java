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
    public boolean isValidBST_recursion(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean helper(TreeNode root, Long min, Long max){
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;
        return helper(root.left, min, Long.valueOf(root.val)) && helper(root.right, Long.valueOf(root.val), max);
    }
    
//--------------------------------
    public boolean isValidBST(TreeNode root){
        Stack<TreeNode> stack = new Stack();
        TreeNode pre = null;
        while(root!= null || !stack.isEmpty()){
            while(root != null){
                stack.add(root);
                root = root.left;
            }
            root = stack.pop();
            if(pre != null && root.val <= pre.val) return false;
            pre = root;
            root = root.right;
        }
        return true;
    }
    
}