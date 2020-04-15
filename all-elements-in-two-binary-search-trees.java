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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList();
        Queue<Integer> q1 = new LinkedList(), q2= new LinkedList();
        helper(root1, q1);
        helper(root2, q2);
        while(!q1.isEmpty() && !q2.isEmpty()){
            if(q1.peek()>q2.peek()) res.add(q2.poll());
            else res.add(q1.poll());
        }
        while(!q1.isEmpty()) res.add(q1.poll());
        while(!q2.isEmpty()) res.add(q2.poll());
        return res;
    }
    
    public void helper(TreeNode root, Queue<Integer> queue){
        if(root == null) return;
        helper(root.left, queue);
        queue.offer(root.val);
        helper(root.right, queue);
    }
    
}