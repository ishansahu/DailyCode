class Solution {
    public int minPathSum_naive(int[][] grid) {
        return helper(grid, grid.length-1,grid[0].length-1);
    }
    
    public int helper(int[][] grid, int r, int c){
        if(r==0 && c==0) return grid[r][c];
        if(r ==0) return helper(grid, r, c-1);
        if(c==0) return helper(grid,r-1,c);
        return grid[r][c] + Math.min(helper(grid,r,c-1), helper(grid, r-1,c)) ;
    }
    
    public int minPathSum(int[][] grid) {
        for( int r=0; r<grid.length; ++r){
            for(int c=0; c<grid[0].length; ++c){
                if(r==0 && c==0)continue;
                else if(r==0) grid[r][c] += grid[r][c-1];
                else if(c==0) grid[r][c] += grid[r-1][c];
                else grid[r][c] +=  Math.min(grid[r-1][c],grid[r][c-1]); 
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}