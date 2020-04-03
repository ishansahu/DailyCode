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
    private TreeNode prev = null;
    public void flatten_recursive(TreeNode root) {
        if(root == null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
    
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left != null){
                TreeNode trav = curr.left;
                while(trav.right != null) trav= trav.right;
                trav.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}