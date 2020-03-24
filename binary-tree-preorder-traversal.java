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
    public List<Integer> preorderTraversal_recursion(TreeNode root) {
        List<Integer> res = new ArrayList();
        helper(root, res);
        return res;
    }
    
    public void helper(TreeNode root, List<Integer> res){
        if(root == null) return;
        res.add(root.val);
        helper(root.left, res);
        helper(root.right, res);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        while(root != null || !stack.isEmpty()){
            while(root !=null){
                res.add(root.val);
                stack.add(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return res;
    }
    
}