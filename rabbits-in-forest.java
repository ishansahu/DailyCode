class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int curr: answers){
            map.put(curr, map.getOrDefault(curr,0)+1);
        }
        int res =0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int k = entry.getKey();
            int v = entry.getValue();
            if(v%(k+1) ==0 ) res += ((v/(k+1)))* (k+1);
            else res += ((v/(k+1)) +1)* (k+1);
        }
        return res;
        
    }
}