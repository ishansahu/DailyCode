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
    
    Stack<Integer> stack;
    public boolean checkEqualTree(TreeNode root) {
        stack = new Stack();
        int total = isSubTree(root);
        stack.pop();
        if(total%2==0){
            for(int i : stack)
                if(i==total/2) return true;
        }
        return false;
    }
    
    public int isSubTree(TreeNode node){
        if(node == null) return 0;
        stack.add(isSubTree(node.left)+isSubTree(node.right) + node.val);
        return stack.peek();
    }
}