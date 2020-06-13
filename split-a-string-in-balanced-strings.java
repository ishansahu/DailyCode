class Solution {
    public int balancedStringSplit(String s) {
        int left=0, right=0, res=0;
        for(char ch : s.toCharArray()){
            if(ch =='L')++left;
            else ++right;
            if(left == right) ++res;
        }
        return res;
    }
}