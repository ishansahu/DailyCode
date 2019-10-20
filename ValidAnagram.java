class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] alphabet = new int[26];
        for(char ch : s.toCharArray()){
            alphabet[ch -'a']++;
        }
        for(char ch : t.toCharArray()){
            if(alphabet[ch -'a'] ==0) return false;
            alphabet[ch-'a']--;
        }
        return true;
    }
}