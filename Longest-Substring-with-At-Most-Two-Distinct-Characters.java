class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if(s==null || s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap();
        int i=0, j=0, res = 0;
        while(j<s.length()){
            int val = map.getOrDefault(s.charAt(j),0);
            map.put(s.charAt(j),val+1);
            
            while(map.size()>2){
                int prev = map.get(s.charAt(i));
                --prev;
                if(prev==0) map.remove(s.charAt(i));
                else map.put(s.charAt(i),prev);
                ++i;    
            }
            res = Math.max(res, j-i+1);
            ++j;
        }
        return res;
    }
}