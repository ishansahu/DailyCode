class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int num : nums) map.put(num, map.getOrDefault(num,0)+1);
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(bucket[entry.getValue()] == null)
                bucket[entry.getValue()] = new ArrayList();
            bucket[entry.getValue()].add(entry.getKey());
        }
        List<Integer> res = new ArrayList();
        for(int i=bucket.length-1; i>0; --i){
            if(bucket[i] !=null){
                for(int j=0; j<bucket[i].size() && res.size()<k ; ++j)
                    res.add(bucket[i].get(j));
            }
        }
        return res;
    }
    public List<Integer> topKFrequent_Sol1(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int num : nums) map.put(num, map.getOrDefault(num,0)+1);
        PriorityQueue<Integer> pq = new PriorityQueue((x,y) -> map.get(x)-map.get(y));
        for(int key : map.keySet()){
            pq.add(key);
            if(pq.size() >k)
                pq.poll();    
        }
        List<Integer> res = new ArrayList();
        while(!pq.isEmpty())
            res.add(pq.poll());
        return res;
    }
}