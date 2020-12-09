class Solution {
    public int minimumEffortPath(int[][] heights) {
        int val = heights[0][0];
        int row = heights.length;
        int col = heights[0].length;
        int[][] arr = new int[row][col];
        for(int i=0; i<row; ++i) Arrays.fill(arr[i],Integer.MAX_VALUE);
        boolean[][] visited = new boolean[row][col];
        int[][] dirs = {{-1,0},{1,0},{0,1},{0,-1}};
        arr[0][0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>(){
           @Override
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        pq.add(new int[]{0,0,0});
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int r= curr[1];
            int c = curr[2];
            if(r==row-1 && c==col-1) return curr[0];
            visited[r][c] = true;
            for(int[] dir : dirs){
                int x = r+dir[0];
                int y = c+dir[1];
                if(isValidCell(x,y,row,col) && !visited[x][y]){
                    int curr_diff = Math.abs(heights[r][c] - heights[x][y]);
                    int max_diff = Math.max(curr_diff,arr[r][c]);
                    if(arr[x][y]>max_diff){
                        arr[x][y] = max_diff;
                        pq.add(new int[]{max_diff,x,y});
                    }
                }
            }
        }
        return -1;
    }
    
    boolean isValidCell(int x, int y, int row, int col) {
        return x >= 0 && x <= row - 1 && y >= 0 && y <= col - 1;
    }
}