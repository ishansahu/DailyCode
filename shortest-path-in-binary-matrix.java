class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] ==1 || grid[n-1][n-1]==1) return -1;
        int[][] dirs = new int[][]{
            {0,-1},{1,-1},{1,-1},{-1,0},{0,1},{-1,1},{1,1},{1,0}
        };
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{0,0});
        int res =0;
        while(!queue.isEmpty()){
            int size = queue.size();
            ++res;
            for(int i=0;i<size; ++i){
                int[] curr = queue.poll();
                if(curr[0]==n-1 && curr[1]==n-1) return res;
                for(int[] dir: dirs){
                    int x = curr[0]+dir[0];
                    int y = curr[1] + dir[1];
                    if(x<0 || x==n || y<0 || y==n || grid[x][y]==1 ) continue;
                    grid[x][y] =1;
                    queue.add(new int[]{x,y});
                }
            }
        }
        return -1;
    }
}