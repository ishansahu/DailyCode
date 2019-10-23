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
    int count;
    public int diameterOfBinaryTree(TreeNode root) {
        count =1;
        depth(root);
        return count-1;
    }
    public int depth(TreeNode root){
        if (root == null ) return 0;
        int l=  depth(root.left);
        int r=  depth(root.right);
        count = Math.max(count, l+r+1);
        return Math.max(l,r)+1;
    }
}