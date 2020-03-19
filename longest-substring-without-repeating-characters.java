class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet();
        int res = 0;
        int i=0, j=0;
        while( i<s.length()){
            if(set.contains(s.charAt(i))){
                 set.remove(s.charAt(j++));
            }else{
                 set.add(s.charAt(i++));   
                 res = Math.max(res,set.size());
            }
            
        }
        return res;
    }
}