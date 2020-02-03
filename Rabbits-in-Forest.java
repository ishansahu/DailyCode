class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int num : answers) map.put(num, map.getOrDefault(num,0)+1);
        int res=0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey(), val = entry.getValue();
            res += (val/(num+1))*(num+1)+((val%(num+1))>0?(num+1):0);
        }
        return res;
    }
}