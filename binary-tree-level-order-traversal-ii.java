/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

BFS
------

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> sublst = new ArrayList();
            for(int i=0; i<len; ++i){
                TreeNode node = queue.poll();
                if(node.left !=null) queue.add(node.left);
                if(node.right !=null) queue.add(node.right);
                sublst.add(node.val);
            }
            res.add(0,sublst);
        }
        return res;
        
    }
}


DFS
-----
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        helper(root, res, 0);  
        return res;
    }
    
    public void helper(TreeNode root, List<List<Integer>> res, int height){
        if(root == null) return;
        if(res.size()<= height){
            res.add(0,new ArrayList());
        }
        helper(root.left, res, height+1);
        helper(root.right, res, height+1);
        res.get(res.size()-height -1).add(root.val);
    }
    
}