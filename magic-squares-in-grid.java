class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int res =0;
        for(int i=0; i<grid.length -2;++i){
            for(int j=0; j<grid[0].length -2; ++j){
                res += helper(grid,i,j) ? 1 :0;
            }
        }
        return res;
    }
    
    public boolean helper(int[][] g, int i, int j){
        if(g[i+1][j+1] !=5) return false;
        
        String str = ""+g[i][j]+g[i][j+1]+g[i][j+2]+g[i+1][j+2]+ g[i+2][j+2] + g[i+2][j+1]+ g[i+2][j]+g[i+1][j];
        return "4381672943816729".contains(str) || "9276183492761834".contains(str);
    }
}