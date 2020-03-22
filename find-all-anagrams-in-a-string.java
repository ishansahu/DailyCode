class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList();
        if(s==null || s.length() ==0 || p==null || p.length() == 0 || p.length()>s.length()) return res;
        HashMap<Character, Integer> map = new HashMap();
        for(char ch : p.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int start =0, end = 0, counter = map.size();
        while(end < s.length()){
            char c1 = s.charAt(end);
            if(map.containsKey(c1)){
                map.put(c1, map.get(c1)-1);
                if(map.get(c1) ==0) --counter;
            }
            ++end;
            while(counter ==0){
                char c2 = s.charAt(start);
                if(map.containsKey(c2)){
                    map.put(c2, map.get(c2)+1);
                    if(map.get(c2)>0) ++counter;
                }
                if(end - start == p.length()) res.add(start);
                ++start;
            }
        }
        return res;
    }
}