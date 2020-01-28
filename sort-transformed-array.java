class Solution {
    public int[] sortTransformedArray(int[] num, int a, int b, int c) {
        int n = num.length;
        int[] res = new int[n];
        int i=0, j = n-1;
        int index = a>= 0 ? n-1: 0;
        while(j>=i){
            if(a>=0)
                res[index--] = (helper(num[i],a,b,c) >= helper(num[j],a,b,c)) ? helper(num[i++],a,b,c) : helper(num[j--],a,b,c);
            else{
                res[index++] = (helper(num[i],a,b,c) <= helper(num[j],a,b,c)) ? helper(num[i++],a,b,c) : helper(num[j--],a,b,c);
            }
        }
        return res;
    }
    
    public int helper(int num, int a, int b, int c){
        return num*num*a + b*num + c;
    }
    
}