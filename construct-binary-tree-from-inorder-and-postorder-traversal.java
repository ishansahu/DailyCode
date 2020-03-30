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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, postorder,inorder.length-1,0, inorder.length-1);
    }
    
    public TreeNode helper(int[] inorder, int[] postorder, int curr, int start, int end){
        if(curr<0 || start>end) return null;
        TreeNode root = new TreeNode(postorder[curr]);
        int index =0;
        for(int i=start; i<=end;i++){
            if(inorder[i] == root.val){
                index = i;
                break;
            }
        }
        root.left = helper(inorder,postorder,curr-1-end+index,start,index-1);
        root.right = helper(inorder, postorder, curr-1,index+1, end);
        return root;
    }
    
}