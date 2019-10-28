class Solution {
    
    HashMap<String, PriorityQueue<String>> map;
    List<String> res;
    public List<String> findItinerary(List<List<String>> tickets) {
        map = new HashMap<>();
        res = new ArrayList<>();
        
        for(List<String> s: tickets){
            if(!map.containsKey(s.get(0))){
                map.put(s.get(0), new PriorityQueue<String>());
                map.get(s.get(0)).add(s.get(1));
            }else{
                map.get(s.get(0)).add(s.get(1));
            }
        }
        visit("JFK");
        return res;
    }
    
    public void visit(String airport){
        while(map.get(airport) !=null &&!map.get(airport).isEmpty()){
            visit(map.get(airport).poll());
        }
        res.add(0,airport);
    }
}