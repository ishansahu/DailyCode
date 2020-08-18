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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(root == null){
            TreeNode curr = new TreeNode(val);
            return curr;
        }
        if(root.val > val) root.right = insertIntoMaxTree(root.right, val);
        else{
            TreeNode curr = new TreeNode(val);
            curr.left = root;
            return curr;
        }
        return root;
    }
}