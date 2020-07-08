class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        HashMap<Integer, List<Integer>> map = new HashMap();
        for(int i=0; i<n; ++i){
            if(i==headID) continue;
            int key = manager[i];
            List<Integer> curr = map.get(manager[i]);
            if(!map.containsKey(manager[i])) curr =new ArrayList();
            curr.add(i);
            map.put(manager[i], curr);
        }
        return helper(map, informTime, headID);
    }
    
    private int helper(HashMap<Integer, List<Integer>> map, int[] informTime, int pos ){
        if(!map.containsKey(pos)) return informTime[pos];
        int max=0;
        for(int i=0; i<map.get(pos).size(); ++i){
            max = Math.max(max, helper(map,informTime, map.get(pos).get(i)));
        }
        return informTime[pos]+max;
    }
}