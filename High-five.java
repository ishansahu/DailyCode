class Solution {
    public int[][] highFive(int[][] items) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap();
        for(int[] item: items){
            int id = item[0];
            PriorityQueue<Integer> pq;
            map.
            if(!map.containsKey(id)){
                pq = new PriorityQueue();
                pq.offer(item[1]);
            }else{
                pq = map.get(id);
                pq.offer(item[1]);
                if(pq.size()>5) pq.poll();
            }
            map.put(id,pq);
        }
        int[][] res = new int[map.size()][2];
        int index=0;
        for(int id : map.keySet()){
            res[index][0] = id;
            PriorityQueue<Integer> pq = map.get(id);
            int size=pq.size(), temp=0;
            while( !pq.isEmpty()){
                temp +=pq.poll();
            }
            res[index++][1] = temp/size;
        }
        return res;
    }
}