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
    public int deepestLeavesSum(TreeNode root) {
        int level = helper(root, 0);
        return bfs(root, level-1, 0, 0);
    }
    
    public int helper(TreeNode root, int curr){
        if(root == null) return curr;
        return Math.max(helper(root.left, curr+1),helper(root.right,curr+1));
    }
    
    public int bfs(TreeNode root, int level,int curr, int sum){
        if(root == null) return sum;
        if(level == curr){
            sum +=root.val;
            return sum;
        }
        return bfs(root.left, level, curr+1, sum) + bfs(root.right, level, curr+1, sum);
    }
}


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
    public int deepestLeavesSum(TreeNode root) {
        int sum=0;
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            sum =0;
            for(int i=0; i<size; ++i){
                TreeNode curr = queue.poll();
                sum += curr.val;
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
            }
        }
        return sum;
    }
}