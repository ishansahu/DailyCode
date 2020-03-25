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
    public final TreeNode getTargetCopy(final TreeNode ori, final TreeNode cloned, final TreeNode target) {
        if(ori == null) return null;
        if(ori.equals(target)) return  cloned;
        TreeNode left = getTargetCopy(ori.left,cloned.left, target);
        if(left !=null) return left;
        TreeNode right = getTargetCopy(ori.right,cloned.right, target);
        if(right !=null) return right;
        return null;
    }
    
}