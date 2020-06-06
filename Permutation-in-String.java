class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap();
        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int start=0, end = 0, counter= map.size();
        while(end<s2.length()){
            char ch1 = s2.charAt(end);
            if(map.containsKey(ch1)){
                map.put(ch1, map.get(ch1)-1);
                if(map.get(ch1) == 0) --counter;
            }
            ++end;
            while(counter ==0){
                char ch2 = s2.charAt(start);
                if(map.containsKey(ch2)){
                    map.put(ch2, map.get(ch2)+1);
                    if(map.get(ch2) > 0) ++counter;
                }
                if(end-start == s1.length()) return true;
                ++start;
            }
        }
        return false;
        
    }
}