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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            boolean xflag=false, yflag=false;
            for(int i=0; i<len; ++i){
                TreeNode node = queue.poll();
                if(node.val == x) xflag = true;
                if(node.val == y) yflag = true;
                if(node.left !=null && node.right !=null){
                    if(node.left.val == x && node.right.val == y || node.left.val == y && node.right.val == x) 
                        return false;
                }
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            if(xflag && yflag) return true;
        }
        return false;
    }
}