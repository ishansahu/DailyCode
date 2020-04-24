class Solution {
    public String sortString(String s) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<s.length()){
            for(int j=0; j<26; ++j){
                if(arr[j]>0){
                    --arr[j];
                    sb.append((char)(j+97));
                } 
            }
            for(int j=25; j>=0; --j){
                if(arr[j]>0){
                    --arr[j];
                    sb.append((char)(j+97));  
                } 
            }
            i = sb.length();
        }
        return sb.toString();
    }
}