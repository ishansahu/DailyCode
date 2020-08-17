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
    public int maxLevelSum(TreeNode root) {
        int sum = Integer.MIN_VALUE, res =0,currlevel =0;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int currSum =0;
            ++currlevel;
            for(int i=0; i<size; ++i){
                TreeNode temp = queue.poll();
                currSum +=temp.val;
                if(temp.left !=null) queue.add(temp.left);
                if(temp.right !=null) queue.add(temp.right);
            }
            if(currSum>sum){
                res = currlevel;
                sum = currSum;
            }
        }
        return res;
    }
}