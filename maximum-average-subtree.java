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
    
    public double maximumAverageSubtree(TreeNode root) {
        List<Double> maxAvg = new ArrayList();
        maxAvg.add(0.0);
        helper(root, maxAvg);
        return maxAvg.get(0);
    }
    
    public Pair<Double, Integer> helper(TreeNode  root, List<Double>  maxAvg){
        if(root == null) return new Pair<Double, Integer>(0.0,0);
        
        Pair<Double, Integer> left = helper(root.left, maxAvg);
        Pair<Double, Integer> right = helper(root.right, maxAvg);
        double curr = (left.getValue()*left.getKey() + right.getValue() * right.getKey() + root.val) /(left.getValue() + right.getValue()+1);
        
        maxAvg.set(0,Math.max(maxAvg.get(0), curr));
        return new Pair<Double, Integer>(curr, left.getValue()+right.getValue()+1);
    }
}