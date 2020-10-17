class Solution {
    public double myPow(double x, int n) {
        int N =n;
        if(n<0){
            N = -N;
            x = 1/x;
        }
        return fast(x, N);
    }
    
    public double fast(double x, int n){
        if(n==0) return 1.0;
        double half = fast(x,n/2);
        if(n%2 ==0) return half*half;
        else return half*half*x;
    }
}