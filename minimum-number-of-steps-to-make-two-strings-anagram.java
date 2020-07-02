class Solution {
    public int minSteps(String s, String t) {
        int[] arr = new int[26];
        for(int i=0; i<t.length(); ++i){
            ++arr[s.charAt(i)-'a'];
            --arr[t.charAt(i)-'a'];
        }
        int res =0;
        for(int i=0; i<26; ++i){
            if(arr[i]> 0) res += arr[i] ;
        }
        return res;
    }
}