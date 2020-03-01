class Solution {
    public int shortestDistance(int[][] maze, int[] start, int[] dest) {
        int[][] dist = new int[maze.length][maze[0].length];
        for(int[] row: dist) Arrays.fill(row, Integer.MAX_VALUE);
        dist[start[0]][start[1]] = 0;
        dfs(maze, start, dist);
        return dist[dest[0]][dest[1]] == Integer.MAX_VALUE ? -1 : dist[dest[0]][dest[1]];
    
    }
    
    public void dfs(int[][] maze, int[] start, int[][] dist){
        int[][] dirs = {{0,1},{0,-1},{-1,0},{1,0}};
        for(int[] dir: dirs){
            int x = start[0]+dir[0];
            int y = start[1]+dir[1];
            int count = 0;
            while (x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 0) {
                x += dir[0];
                y += dir[1];
                count++;
            }
            if (dist[start[0]][start[1]] + count < dist[x - dir[0]][y - dir[1]]) {
                dist[x - dir[0]][y - dir[1]] = dist[start[0]][start[1]] + count;
                dfs(maze, new int[]{x - dir[0],y - dir[1]}, dist);
            }
        }
    }
    
}