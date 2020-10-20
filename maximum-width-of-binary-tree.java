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
    public int widthOfBinaryTree(TreeNode root) {
        
        return helper(root, 1,0, new ArrayList<Integer>());
    }
    
    public int helper(TreeNode root, int val, int level, List<Integer> list){
        if(root==null) return 0;
        if(level== list.size()) list.add(val);
        int curr = val-list.get(level)+1;
        return Math.max(curr, Math.max(helper(root.left, 2*val, level+1, list), helper(root.right, 2*val+1, level+1, list)));
        
    }
    
}