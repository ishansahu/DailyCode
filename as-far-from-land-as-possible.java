class Solution {
    public int maxDistance(int[][] grid) {
        Queue<int[]> queue = new LinkedList();
        int row = grid.length, col = grid[0].length;
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0; i<row; ++i){
            for(int j=0; j<col;++j){
                if(grid[i][j]==1) queue.add(new int[]{i,j});
            }
        }
        if(queue.size()==0) return -1;
        int res =0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int k=0; k<size; ++k){
                int[] curr = queue.poll();
                int px = curr[0];
                int py = curr[1];
                for(int[] d : dirs){
                    int r = px + d[0];
                    int c = py + d[1];
                    if(r<0 || r>= row || c<0 || c>=col || grid[r][c]==1) continue;
                    grid[r][c] = 1;
                    queue.offer(new int[]{r,c});
                }    
            }
            if(!queue.isEmpty()) ++res;
        }
        return res;
    }
}