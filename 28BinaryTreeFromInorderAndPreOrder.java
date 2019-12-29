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
    int[] inorder, postorder;
    HashMap<Integer, Integer> map;
    int post_id;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        this.inorder = inorder;
        this.postorder = postorder;
        post_id = postorder.length-1;
        
        int k=0;
        for(int i: inorder){
            map.put(i,k++);
        }
        return helper(0, post_id);
    }
    
    public TreeNode helper(int in_l, int in_r){
        if(in_l > in_r) return null;
        int r_val = postorder[post_id];
        TreeNode root = new TreeNode(r_val);
        int index = map.get(r_val);
        post_id--;
        root.right = helper(index+1, in_r);
        root.left = helper(in_l,index-1);
        
        return root;
    }
}