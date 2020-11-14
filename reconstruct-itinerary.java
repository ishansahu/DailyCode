class Solution {
    LinkedList<String> linked;
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, PriorityQueue<String>> graph = new HashMap();
        for(List<String> list : tickets){
            String key = list.get(0);
            String val = list.get(1);
            PriorityQueue<String> temp = graph.getOrDefault(key, new PriorityQueue<String>());
            temp.add(val);
            graph.put(key,temp);
        }
        linked = new LinkedList();
        helper(graph,"JFK");
        return linked;
    }

    public void helper(HashMap<String, PriorityQueue<String>> graph, String key){
        PriorityQueue<String> vertex = graph.get(key);
        while(vertex != null && !vertex.isEmpty()){
            helper(graph, vertex.poll());
        }
        linked.addFirst(key);
    }
    
}