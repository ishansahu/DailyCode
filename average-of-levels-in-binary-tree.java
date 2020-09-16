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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            long avg = 0;
            for(int i=0; i<len; ++i){
                TreeNode temp = queue.poll();
                avg += temp.val;
                if(temp.left !=null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
            res.add(avg*1.0/len);
        }
        return res;
    }
}