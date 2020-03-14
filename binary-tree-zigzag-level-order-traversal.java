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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList();
        boolean flag=false;
        queue.offer(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> sublst = new ArrayList();
            for(int i=0; i<len; ++i){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                if(flag) sublst.add(0,queue.poll().val);
                else sublst.add(queue.poll().val);
            }
            flag = !flag;
            res.add(sublst);
        }
        return res;
    }
}