class Solution {
    public int islandPerimeter(int[][] grid) {
        for(int i=0; i<grid.length; ++i){
            for(int j=0; j<grid[0].length; ++j){
                if(grid[i][j] ==1){
                    return helper(grid, i, j);
                }
            }
        }
        return 0;
    }
    
    public int helper(int[][] grid, int r, int c){
        if(r>=grid.length || r<0 || c>= grid[0].length || c<0 || grid[r][c] == 0 ) return 1;
        if(grid[r][c]==2) return 0;
        grid[r][c] =2;
        int res =0;
        res += helper(grid, r-1,c);
        res += helper(grid, r+1,c);
        res += helper(grid, r,c-1);
        res += helper(grid, r,c+1);
        return res;
    }
}