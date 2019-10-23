class Solution {
    public int mySqrt(int x) {
        if(x <2) return x;
        
        int i,start = 2, end = x/2;
        long num;
        while(start <= end){
            i = start + (end-start)/2;
            num = (long)i*i;
            if (num > x) end = i - 1;
            else if (num<x) start = i +1;
            else return i;
        }
        return end;
    }
}