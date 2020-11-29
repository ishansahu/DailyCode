/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Integer, Node> map = new HashMap();
        Node root = new Node(1);
        map.put(1,root);
        HashSet<Integer> set = new HashSet();
        helper(node, set,map);
        return root;
    }
    
    private void helper(Node root, HashSet<Integer> set, HashMap<Integer, Node> map){
        if(set.contains(root.val)) return;
        set.add(root.val);
        Node curr = map.get(root.val);
        for(Node adj : root.neighbors){
            Node temp = map.getOrDefault(adj.val, new Node(adj.val));
            map.put(temp.val,temp);
            curr.neighbors.add(temp);
            helper(adj, set, map);
        }
        
    }
}