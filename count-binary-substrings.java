class Solution {
    public int countBinarySubstrings(String s) {
        int cZero=0, cOne=0, prev=-1, ans=0;
        for(char c:s.toCharArray()){
            int i=(int)(c-'0');
            if(prev==0 && i==1) {
                ans+=Math.min(cZero, cOne);
                cOne=0;
            }
            else if(prev==1 && i==0) {
                ans+=Math.min(cZero, cOne);
                cZero=0;
            }
            if(i==1) cOne++;
            else cZero++;
            prev=i;
        }
        ans+=Math.min(cZero, cOne);
        return ans;
    }
}