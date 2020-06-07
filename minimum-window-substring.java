class Solution {
    public String minWindow(String s, String t) {
        String res = new String(); 
        if(s==null ||s.length() == 0 || t==null || t.length() ==0 || t.length()>s.length()) return res;
        HashMap<Character, Integer> map = new HashMap();
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int start = 0, end = 0, counter = map.size(), len= Integer.MAX_VALUE;
        while(end < s.length()){
            char ch1 = s.charAt(end);
            if(map.containsKey(ch1)){
                map.put(ch1, map.get(ch1)-1);
                if(map.get(ch1) ==0) --counter;
            }
            ++end;
            while(counter == 0){
                char ch2 = s.charAt(start);
                if(map.containsKey(ch2)){
                    map.put(ch2, map.get(ch2)+1);
                    if(map.get(ch2)>0)++counter;
                }
                if(end - start< len){
                    len = end - start;
                    res = s.substring(start,end);
                }
                ++start;
            }
        }
        return res;
    }
}