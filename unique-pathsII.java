class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int h = obstacleGrid.length, w = obstacleGrid[0].length ;
        if(obstacleGrid[0][0] == 1) return 0; 
        for(int r =0; r<h; ++r){
            for(int c=0; c<w; ++c){
                if (obstacleGrid[r][c] ==1) obstacleGrid[r][c]=0;
                else if(r==0 && c==0) obstacleGrid[r][c] =1;
                else if(r==0) obstacleGrid[r][c]= obstacleGrid[r][c-1];
                else if(c==0) obstacleGrid[r][c] = obstacleGrid[r-1][c];
                else obstacleGrid[r][c] = obstacleGrid[r][c-1]+obstacleGrid[r-1][c];
            }
        }
        return obstacleGrid[h-1][w-1];
    }
}