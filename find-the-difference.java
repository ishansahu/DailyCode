class Solution {
    public char findTheDifference(String s, String t) {
        int[] sarr = new int[26];
        int[] tarr = new int[26];
        
        for(int i=0; i<s.length(); ++i){
            ++sarr[s.charAt(i) -'a'];
            ++tarr[t.charAt(i) -'a'];
        }
        ++tarr[t.charAt(t.length()-1) -'a'];
        
        for(int i=0; i<26;++i){
            if(sarr[i] !=tarr[i]){
                return (char) (i+97);
            }
        }
        throw new IllegalArgumentException();
    }
}