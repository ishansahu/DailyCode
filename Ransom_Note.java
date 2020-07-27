class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] carr = new int[26];
        for(char ch : magazine.toCharArray()) carr[ch-'a']++;
        for(char ch : ransomNote.toCharArray()){
            if(carr[ch-'a']>0) --carr[ch-'a'];
            else return false;
        }
        return true;
    }
}