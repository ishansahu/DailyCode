class Solution {
    public String customSortString(String S, String T) {
        int[] arr = new int[26];
        for(char ch : T.toCharArray()){
            ++arr[ch-'a'];
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : S.toCharArray()){
            while(arr[ch-'a'] >0){
                sb.append(ch);
                --arr[ch-'a'];
            }
        }
        for(char ch : T.toCharArray()){
            while(arr[ch-'a'] >0){
                sb.append(ch);
                --arr[ch-'a'];
            }
        }
        return sb.toString();
    }
}