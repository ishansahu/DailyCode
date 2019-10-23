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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null ) return new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> depqueue = new LinkedList<>();
        int max_depth=-1;
        queue.add(root);
        depqueue.add(0);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            int depth = depqueue.poll();
            if(node !=null){
                max_depth = Math.max(max_depth,depth);
                map.put(depth, node.val);
                queue.add(node.left);
                queue.add(node.right);
                depqueue.add(depth+1);
                depqueue.add(depth+1);
            }
        }
        List<Integer> res = new ArrayList<>();
        //for(Map.Entry s: map.entrySet()){
        //    res.add((Integer)s.getValue());
        //}
        for (int depth = 0; depth <= max_depth; depth++) {
            res.add(map.get(depth));
        }
        return res;
    }
}