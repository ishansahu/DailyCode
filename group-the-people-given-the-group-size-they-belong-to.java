class Solution {
    public List<List<Integer>> groupThePeople_mySol(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList();
        HashMap<Integer, List<Integer>> map = new HashMap();
        for(int i=0; i<groupSizes.length; ++i){
            List<Integer> temp;
            if(map.get(groupSizes[i]) == null) temp = new ArrayList();
            else temp = map.get(groupSizes[i]);
            temp.add(i);
            map.put(groupSizes[i],temp);
        }
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            int key = entry.getKey();
            List<Integer> temp = entry.getValue();
            List<Integer> lst = new ArrayList();
            for(int i=0; i<temp.size(); ++i){
                if(i%key==0){
                    res.add(lst);
                    lst.clear();
                }
                lst.add(temp.get(i));
            }
        }
        
        return res;
    }
    public List<List<Integer>> groupThePeople(int[] groupSizes){
        List<List<Integer>> res = new ArrayList();
        HashMap<Integer, List<Integer>> map = new HashMap();
        for(int i=0; i<groupSizes.length; ++i){
            if(!map.containsKey(groupSizes[i])) map.put(groupSizes[i], new ArrayList());
            List<Integer> temp = map.get(groupSizes[i]);
            temp.add(i);
            if(temp.size()==groupSizes[i]){
                res.add(temp);
                map.remove(groupSizes[i]);
            }
        }
        return res;
    }
}