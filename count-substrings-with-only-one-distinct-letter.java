class Solution {
    public int countLetters(String S) {
        int ans =0;
        int prev =(int)S.charAt(0)-'a', tempc=0;
        for(char c : S.toCharArray()){
            int curr = (int)(c-'a');
            if(curr != prev){
                ans += tempc*(tempc +1)/2;
                tempc =1;
                prev=curr;
            }else ++tempc;
        }
        ans+=tempc*(tempc+1)/2;
        return ans;
    }
}