class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        List<Integer> res = new ArrayList();
        for(int i=0; i<n; ++i){
            if(dfs(graph, color, i)) res.add(i);
        }
        return res;
    }
    
    public boolean dfs(int[][] graph, int[] color, int node){
        if(color[node]>0) return color[node] == 2;
        color[node] =1;
        for (int adjacent : graph[node]){
            if(color[adjacent] ==2) continue;
            if(color[adjacent] ==1 || !dfs(graph, color, adjacent)) return false;
        }
        color[node] = 2;
        return true;
    }
}