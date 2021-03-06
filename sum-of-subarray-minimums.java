class Solution {
    public int sumSubarrayMins(int[] A) {
        int mod = (int)1e9+7;
        int n = A.length;
        Stack<int[]> s1 = new Stack();
        Stack<int[]> s2 = new Stack();
        int[] left = new int[n];
        int[] right = new int[n];
        
        for(int i=0; i<n; ++i){
            int count = 1;
            while(!s1.isEmpty() && s1.peek()[0]>A[i]){
                count += s1.pop()[1];
            }
            s1.push(new int[]{A[i], count});
            left[i] = count;
        }
        for(int i=n-1; i>=0; --i){
            int count =1;
            while(!s2.isEmpty() && s2.peek()[0]>=A[i]){
                count += s2.pop()[1];
            }
            s2.push(new int[]{A[i],count});
            right[i] = count;
        }
        int res=0;
        for(int i=0; i<n; ++i){
            res= (res + left[i]*right[i]*A[i])%mod;
        }
        return res;
        
    }
}