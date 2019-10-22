class Solution {
    public int majorityElement(int[] num) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< num.length; i++){
            map.put(num[i], map.getOrDefault(num[i],0)+1);
        }
        int max=1, n = num[0];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                n = entry.getKey();
            }
        }
        return n;
    }
}