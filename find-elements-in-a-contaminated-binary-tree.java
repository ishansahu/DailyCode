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
class FindElements {
    TreeNode main = new TreeNode(); 
    public FindElements(TreeNode root) {
        main = root;
        helper(main, 0);
    }
    
    public boolean find_ori(int target) {
        Queue<TreeNode> queue = new LinkedList();
        TreeNode curr = main;
        queue.offer(curr);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.val ==target) return true;
            if(temp.left != null || temp.right != null ){
                if(temp.left != null && temp.left.val == target ) return true;
                else if(temp.left != null && temp.left.val<target ) queue.offer(temp.left);
                if(temp.right != null && temp.right.val == target ) return true;
                else if(temp.right != null && temp.right.val<target ) queue.offer(temp.right);
            } 
        }
        return false;
    }
    HashSet<Integer> set = new HashSet();
    public void helper(TreeNode main, int val){
        if(main == null) return;
        main.val = val;
        set.add(val);
        helper(main.left, 2*val +1);
        helper(main.right, 2*val +2);
    }
    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */