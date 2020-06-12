class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid[0].length];
        for(int i=0; i<colMax.length; ++i){
            for(int j=0;j<rowMax.length;++j){
                colMax[i] = Math.max(colMax[i], grid[j][i]);
                rowMax[j] = Math.max(rowMax[j], grid[j][i]);
            }
        }
        int sum=0;
        for(int i=0; i<rowMax.length; ++i){
            for(int j=0; j<colMax.length; ++j){
                sum+=Math.min(rowMax[i],colMax[j]) - grid[i][j];
            }
        }
        
        return sum;
    }
}