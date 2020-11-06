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
    
    public int rob_brute(TreeNode root) {
        if(root == null) return 0;
        int res=root.val;
        if(root.left != null){
            res += rob(root.left.left) + rob(root.left.right);
        }
        if(root.right != null){
            res +=rob(root.right.left) + rob(root.right.right);
        }
        
        return Math.max(res, rob(root.left)+rob(root.right));
    }
    
    public int rob_memoization(TreeNode root) {
        HashMap<TreeNode, Integer> map = new HashMap();
        return helper(root, map);
    }
    
   public int helper(TreeNode root, HashMap<TreeNode, Integer> map){
       if(root==null) return 0;
       if(map.containsKey(root)) return map.get(root);
       
       int res = root.val;
       if(root.left != null){
            res += helper(root.left.left,map) + helper(root.left.right, map);
        }
        if(root.right != null){
            res +=helper(root.right.left, map) + helper(root.right.right, map);
        }
       res = Math.max(res, helper(root.left, map)+helper(root.right, map));
       map.put(root, res);
       return res;
    }
    
    //Iterative Solution
    public int rob(TreeNode root) {
        int res[] = helper2(root);
        return Math.max(res[0], res[1]);
    }
    
    public int[] helper2(TreeNode root){
        if(root == null) return new int[2];
        
        int[] left = helper2(root.left);
        int[] right = helper2(root.right);
        
        int[] res = new int[2];
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        res[1] = root.val + left[0] + right[0];
        return res;
    }
    
}