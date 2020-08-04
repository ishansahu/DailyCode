class Solution {
    public int closedIsland(int[][] grid) {
        int row = grid.length-1, col = grid[0].length-1;
        for(int r = 0; r<=row; ++r){
            if(grid[r][0]==0) helper(grid,r,0,1);
            if(grid[r][col]==0) helper(grid,r,col,1);
        }
        for(int c=0; c<=col; ++c){
            if(grid[0][c]==0)helper(grid,0,c,1);
            if(grid[row][c]==0)helper(grid,row,c,1);
        }
        
        int res = 0;
        
        for(int i=1; i<row; ++i){
            for(int j=1; j<col; ++j){
                if(grid[i][j]==0){
                    ++res;
                    helper(grid,i,j,2);
                }
            }
        }
        return res;
    }
    
    private void helper(int[][] grid, int r, int c, int color){
        if(r==grid.length || r<0 || c==grid[0].length || c<0 || grid[r][c]==1|| grid[r][c]==2 )return;
        grid[r][c] =color;
        helper(grid, r-1,c, color);
        helper(grid, r+1,c, color);
        helper(grid, r,c-1, color);
        helper(grid, r,c+1, color);
    }
}