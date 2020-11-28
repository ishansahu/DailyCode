class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] arr = new int[26];
        for(int i=0; i<26; ++i){
            arr[order.charAt(i)-'a'] = i;
        }
        for(int i=1; i<words.length; ++i){
            int j =0;
            while(j<words[i-1].length()){
                if(j==words[i].length()) return false;
                int val = arr[words[i-1].charAt(j)-'a'] - arr[words[i].charAt(j)-'a'];
                if(val == 0) ++j;
                else if (val > 0) return false;
                else break;
            }
        }
        return true;
    }
}