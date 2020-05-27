class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap();
        int max = Integer.MIN_VALUE;
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
            max = Math.max(max, map.get(num));
        }
        boolean[] bol = new boolean[max+1];
        for(int pos : map.values()){
            if(bol[pos] == false) bol[pos] = true;
            else return false;
        }
        return true;
    }
}