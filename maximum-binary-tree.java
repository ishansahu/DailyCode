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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(null, nums,0, nums.length-1);
    }
    
    public TreeNode helper(TreeNode root, int[] nums, int l, int r){
        if(l>r) return root;
        int max = Integer.MIN_VALUE, index=l;
        for(int i=l; i<=r; ++i){
            if(nums[i] >max){
                index =i;
                max = nums[i];
            } 
        }
        root = new TreeNode(max);
        root.left = helper(root.left, nums, l,index-1);
        root.right = helper(root.right, nums, index+1,r);
        return root;
        
    }
}