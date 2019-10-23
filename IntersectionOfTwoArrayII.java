class Solution {
    public int[] intersect(int[] num1, int[] num2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : num1){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        List<Integer> res = new ArrayList<Integer>();
        for(int i : num2){
            if(map.containsKey(i)){
                res.add(i);
                if (map.get(i) >1)
                    map.put(i, map.get(i)-1);
                else
                    map.remove(i);
            }
        }
        int[] ans = new int[res.size()];
        for(int i = 0;i < ans.length;i ++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
