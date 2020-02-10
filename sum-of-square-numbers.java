class Solution {
    public boolean judgeSquareSum(int c) {
        int n1=(int)Math.sqrt(c);
        int n2=0;
        while(n2<=n1){
            int temp = n2*n2 +n1*n1;
            if(temp == c) return true;
            else if (temp>c) --n1;
            else ++n2;
        }
        return false;
    }
}