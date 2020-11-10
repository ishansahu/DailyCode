class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, List<Pair<String, Double>>> graph = new HashMap();
        int n = values.length;
        for(int i=0; i<n;++i){
            String s = equations.get(i).get(0);
            String d = equations.get(i).get(1);
            List<Pair<String, Double>> s_adj = graph.getOrDefault(equations.get(i).get(0), new ArrayList());
            List<Pair<String, Double>> d_adj = graph.getOrDefault(equations.get(i).get(1), new ArrayList());
            s_adj.add(new Pair(d,values[i]));
            d_adj.add(new Pair(s, 1/values[i]));
            graph.put(s,s_adj);
            graph.put(d,d_adj);
        }
        
        double[] res = new double[queries.size()];
        for(int i=0; i<queries.size(); ++i){
            List<String> edge = queries.get(i);
            String s = edge.get(0);
            String d = edge.get(1);
            if(!graph.containsKey(s)){
                res[i] = -1;
                continue;
            }
            HashSet<String> visited = new HashSet();
            double value = dfs(graph, visited, s, d, 1.0);
            res[i] = value<0?-1.0:value;
        }
        return res;
    }
    
    public double dfs(HashMap<String, List<Pair<String, Double>>> graph, HashSet<String> visited, String vertex, String d, double curr){
        if(!graph.containsKey(vertex) || visited.contains(vertex)) return -1;
        visited.add(vertex);
        double val = 1.0;
        List<Pair<String, Double>> adjacent = graph.get(vertex);
        for(int i=0; i<adjacent.size(); ++i){
            Pair<String, Double> node = adjacent.get(i);
            if(d.equals(node.getKey())) return curr*node.getValue();
            else{
                val = dfs(graph, visited, node.getKey(), d, curr*node.getValue());
                if(val >0) return val;
            } 
        }
        visited.remove(vertex);
        return val;
    }
}