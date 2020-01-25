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
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> ls = new ArrayList();
        List<List<Integer>> res = new ArrayList();
        return helper(root, sum, 0, ls, res, 0);
    }
    
    public List<List<Integer>> helper(TreeNode root, int sum, int currsum, List<Integer> ls, List<List<Integer>> res, int count){
        if(root == null) return new ArrayList<>();
        int temp = root.val + currsum;
        ls.add(root.val);
        if(temp == sum && root.left == null && root.right == null){
            res.add(new ArrayList(ls));
        }
        helper(root.left, sum, temp, ls, res, ls.size());
        helper(root.right, sum, temp, ls, res, ls.size());
        ls.remove(count);
        return res;
    }
}