class Solution {
    public int leastInterval(char[] tasks, int n) {
        int res =0;
        n++;
        HashMap<Character, Integer> map = new HashMap();
        for(Character ch : tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<HashMap.Entry<Character,Integer>> pq = new PriorityQueue<>((x,y) -> y.getValue() - x.getValue());
        for(Map.Entry<Character,Integer> entry : map.entrySet() ){
            pq.offer(entry);
        }
        while(pq.size() > 0){
            HashMap<Character, Integer> map2 = new HashMap();
            HashMap.Entry<Character, Integer> temp;
            int i=0;
            for(;i<n && pq.size()>0; i++){
                temp= pq.poll();
                if (temp.getValue()>1 )
                    map2.put(temp.getKey(), temp.getValue()-1);
                res++;
            }
            for(HashMap.Entry<Character,Integer> entry: map2.entrySet()){
                pq.offer(entry);
            }
            if(i<n && pq.size() !=0 )
                res += (n-i);
            
        }
        return res;
        
    }
}