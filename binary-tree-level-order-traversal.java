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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        List<List<Integer>> res = new ArrayList();
        queue.add(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> sublst = new ArrayList();
            for(int i=0; i<level; ++i){
                if(queue.peek().left !=null) queue.add(queue.peek().left);
                if(queue.peek().right !=null) queue.add(queue.peek().right);
                sublst.add(queue.poll().val);
            }
            res.add(sublst);
        }
        return res;
    }
}