class Solution {
    public int maximalSquare(char[][] m) {
        if(m == null || m.length <1) return 0;
        int[][] t = new int[m.length+1][m[0].length+1];
        int count=0;
        for(int i=1; i <= m.length; i++){
            for(int j=1; j<=m[0].length; j++){
                if(m[i-1][j-1] =='1'){
                    t[i][j] = Math.min(Math.min(t[i][j-1],t[i-1][j]),t[i-1][j-1] ) +1;
                    count = Math.max(count, t[i][j]);
                }
            }
        }
        return count*count;
    }
}