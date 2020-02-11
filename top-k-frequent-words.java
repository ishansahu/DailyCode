class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap();
        for(String word : words) map.put(word, map.getOrDefault(word,0)+1);
        List<String>[] bucket = new ArrayList[words.length+1];
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(bucket[entry.getValue()] == null)
                bucket[entry.getValue()] = new ArrayList();
            bucket[entry.getValue()].add(entry.getKey());
        }
        List<String> res = new ArrayList();
        for(int i= bucket.length -1 ;res.size() < k && i >0; --i){
            if(bucket[i] !=null){
                Collections.sort(bucket[i]);    
                res.addAll(bucket[i]);
            }
        }
        return res.subList(0,k);
    }
}