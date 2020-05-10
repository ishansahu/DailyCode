class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> path = new ArrayList();
        path.add(0);
        helper(graph, 0, res, path);
        return res;
    }
    
    public void helper(int[][] graph, int index, List<List<Integer>> res, List<Integer> path){
        if(index == graph.length-1){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for(int i=0; i<graph[index].length; ++i){
            path.add(graph[index][i]);
            helper(graph,graph[index][i], res,path);
            path.remove(path.size()-1);
        }
    }
    
}