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
    public boolean isSameTree_recursive(TreeNode p, TreeNode q) {
        if(p == null && q== null) return true;
        if(p==null || q==null || p.val!=q.val) return false;
        return isSameTree(p.left,  q.left) && isSameTree(p.right, q.right);
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        Stack<TreeNode> s1 = new Stack();
        Stack<TreeNode> s2 = new Stack();
        while((!s1.isEmpty() && !s2.isEmpty()) ||(p!=null && q!=null)){
            while(p!=null || q!=null){
                if(p ==null || q==null || p.val !=q.val) return false;
                s1.push(p);
                s2.push(q);
                p=p.left;
                q=q.left;
            }
            p = s1.pop();
            q = s2.pop();
            p=p.right;
            q=q.right;
        }
        return !s1.isEmpty() || !s2.isEmpty()? false:true;
    }
    
}