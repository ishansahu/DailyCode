class Solution {
    HashSet<Integer> set;
    
    public int[] findRedundantConnection(int[][] edges) {
        set = new HashSet();
        ArrayList<Integer>[] graph = new ArrayList[edges.length+1];
        for(int i=0; i< graph.length; ++i) graph[i] = new ArrayList();
        for(int[] edge : edges){
            set.clear();
            if(!graph[edge[0]].isEmpty() && !graph[edge[1]].isEmpty() && dfs(graph, edge[0], edge[1]))
                    return edge;
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        return new int[2];
    }
    
    public boolean dfs(ArrayList<Integer>[] graph, int start, int end){
        if(start == end ) return true;
        if(!set.contains(start)){
            set.add(start);
            for(int edg : graph[start]){
                if( dfs(graph, edg, end)) return true;
            }
            
        }
        return false;
            
    }
    
}