class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap();
        int max =0;
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            max = Math.max(max, map.get(ch));
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((n1, n2) -> n2.getValue() - n1.getValue());
        for(Map.Entry<Character, Integer> entry: map.entrySet()) pq.add(entry);
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> entry = pq.poll();
            for(int i=0; i<entry.getValue(); ++i) sb.append(entry.getKey());
        }
        return sb.toString();
    }
    
    public String frequencySort_other(String s) {
        HashMap<Character, Integer> map = new HashMap();
        int max =0;
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            max = Math.max(max, map.get(ch));
        }
        List<Character>[] arr = new List[max+1];
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            int pos = entry.getValue();
            if(arr[pos] == null) arr[pos] = new ArrayList();
            arr[pos].add(entry.getKey());
        }
        StringBuilder sb = new StringBuilder();
        for(int i=max;i>0; --i){
            if(arr[i] != null){
                for(int j=0; j<arr[i].size(); ++j){
                    for(int k=1; k<=i; ++k) sb.append(arr[i].get(j));
                }
            }
        }
        return sb.toString();
    }
}