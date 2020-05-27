class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);  
            max = Math.max(max, map.get(num));
        } 
        List<Integer>[] arr = new List[max+1];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int pos = entry.getValue();
            if(arr[pos] == null) arr[pos] = new ArrayList();
            arr[pos].add(entry.getKey());
        }
        int[] res = new int[k];
        int p=0;
        for(int i=max; i>0;--i){
            if(arr[i]!=null){
                for(int j=0; j<arr[i].size() && p<k;++j){
                    res[p++] = arr[i].get(j);
                }
            }
        }
        return res;
    }
}