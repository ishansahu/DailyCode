class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int count =1,r=0,c=0, row = n-1, col = n-1;
        
        while(r<=row && c<=col){
            for(int i=c; i<=col ; i++){
                res[r][i] = count++;
            }
            r++;
            for(int i=r; i <= row; i++){
                res[i][col] = count++;
            }
            col--;
            for(int i=col; i>=c && c<=col;i--){
                    res[row][i] = count++;
            }
            row--;
            for(int i=row; i>=r && r<=row; i--){
                res[i][c] = count++;
            }
            c++;
        }
        return res;
    }
}