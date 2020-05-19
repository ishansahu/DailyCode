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
    public int sumEvenGrandparent(TreeNode root) {
        return helper(root, false,false,0);
    }
    
    public int helper(TreeNode root, boolean gParent, boolean parent, int sum){
        if(root == null) return sum;
        if(gParent == true ) sum += root.val;
        boolean child=false;
        if(root.val%2==0) child = true;
        sum =  helper(root.left,parent,child,sum);
        sum = helper(root.right, parent,child,sum);
        return sum;
    }
}