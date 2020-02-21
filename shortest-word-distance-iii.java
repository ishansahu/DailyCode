class Solution {
    public int shortestWordDistance_mysol(String[] words, String word1, String word2) {
        HashMap<String,List<Integer>> map = new HashMap();
        for(int i=0; i<words.length; ++i){
            List<Integer> ls = map.getOrDefault(words[i], new ArrayList<Integer>());
            ls.add(i);
            map.put(words[i], ls);
        }
        int res = Integer.MAX_VALUE;
        if(word1.equals(word2)){
            List<Integer> l1 = map.get(word1);
            int first = l1.get(0), p1=1;
            while(p1<l1.size()){
                res = Math.min(res, (l1.get(p1)-first));
                first=l1.get(p1++);
            }
        }else{
            List<Integer> l1 = map.get(word1), l2= map.get(word2);
            int p1=0, p2=0;
            while(p1<l1.size() && p2<l2.size()){
                res = Math.min(res, Math.abs(l1.get(p1)-l2.get(p2)));
                if(l1.get(p1)<l2.get(p2)) ++p1;
                else ++p2;
            }
        }
        return res;
    }
    public int shortestWordDistance(String[] words, String word1, String word2) {
            int index = -1;
            int min = words.length;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(word1) || words[i].equals(word2)) {
                    if (index != -1 && (word1.equals(word2) || !words[index].equals(words[i]))) {
                        min = Math.min(i - index, min);
                    }
                    index = i;
                }
            }
            return min;
        }
}