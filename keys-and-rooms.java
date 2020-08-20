class Solution {
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer>  set = new HashSet();
        set.add(0);
        return helper(rooms, set, 0);
    }
    
    public boolean helper(List<List<Integer>> rooms, HashSet<Integer>  set, int index){
        if(set.size() == rooms.size()) return true;
        List<Integer> lst = rooms.get(index);
        for(int i=0; i<lst.size(); ++i){
            int curr = lst.get(i);
            if(set.contains(curr)) continue;  
            set.add(curr);
            if(helper(rooms, set, curr)) return true;
        }
        return set.size() == rooms.size();
    }
}