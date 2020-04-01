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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0,0,preorder.length-1);
    }
    
    public TreeNode helper(int[] preorder, int[] inorder, int curr, int start, int end){
        if(curr > preorder.length-1 || start>end ) return null;
        int index =0;
        TreeNode root = new TreeNode(preorder[curr]);
        for(int i=start; i<=end; ++i){
            if(inorder[i]==root.val){
                index =i;
                break;
            } 
        }
        root.left = helper(preorder, inorder, curr+1, start, index-1);
        root.right = helper(preorder, inorder, curr+index-start+1, index+1, end);
        return root;  
    }
}