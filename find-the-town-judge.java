class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] judge = new int[N+1];
        for(int[] elem : trust){
            --judge[elem[0]];
            ++judge[elem[1]];
        }
        
        for(int i=1; i<=N; ++i){
            if(judge[i] == N-1) return i;
        }
        return -1;
    }
}