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
    public int pathSum(TreeNode root, int sum) {
        HashMap<Integer, Integer> map = new HashMap();
        map.put(0,1);
        return helper(root,sum, 0, map);
        
    }
    
    public int helper(TreeNode root, int sum, int currsum, HashMap<Integer, Integer> map){
        if(root == null) return 0;
        currsum += root.val;
        
        int res = map.getOrDefault(currsum - sum, 0);
        map.put(currsum, map.getOrDefault(currsum, 0)+1 );
        
        res += helper(root.left,sum, currsum, map) + helper(root.right,sum, currsum, map);
        map.put(currsum, map.get(currsum) -1);
        return res;
    }
}