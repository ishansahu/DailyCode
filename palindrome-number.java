class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x>0 && x%10==0) return false;
        int temp=0;
        while(temp<x){
            temp *=10;
            temp +=(x%10);
            x/=10;
        }
        return temp == x || temp/10==x;
    }
}