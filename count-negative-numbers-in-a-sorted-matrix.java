class Solution {
    public int countNegatives(int[][] grid) {
        int res=0, r = grid[0].length-1;
        for(int i=0; i<grid.length; ++i){
            int l=0;
            while(r>l){
                int mid = l + (r-l)/2;
                if(grid[i][mid]>=0){
                    l = mid+1;
                }else r= mid;
            }
            if(grid[i][r] <0) res += grid[i].length-l;
        }
        return res;
    }
}