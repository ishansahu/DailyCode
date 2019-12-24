class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length ==0) return 0;
        int row = grid.length, col = grid[0].length, f_count =0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<row;i++){
            for(int j=0; j<col;j++){
                if(grid[i][j] ==2)
                    queue.offer(new int[]{i,j});
                else if(grid[i][j] == 1)
                    f_count++;
            }
        }
        if(f_count == 0) return 0;
        int mins =0;
        int[][] dia = {{0,-1},{0,1},{-1,0},{1,0}};
        while(!queue.isEmpty()){
            mins++;
            int len = queue.size();
            for(int i=0; i<len; i++){
                int[] pt = queue.poll();
                for(int[] dir : dia){
                    int r = pt[0] + dir[0];
                    int c = pt[1] + dir[1];
                    if(r <0 || c< 0 || r >=row || c>=col|| grid[r][c] ==0 || grid[r][c] ==2) continue;
                    grid[r][c] =2;
                    queue.offer(new int[]{r,c});
                    f_count--;
                }
            }
        }
        return f_count == 0 ? mins-1: -1;
    }
}