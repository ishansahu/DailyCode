class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int[][] dirs = new int[][]{{0,-1}, {0,1}, {1,0}, {-1,0}};
        Queue<int[]> queue = new LinkedList();
        int row = matrix.length, col= matrix[0].length;
        for(int i=0; i<row; ++i){
            for(int j=0; j<col; ++j){
                if(matrix[i][j]==0){
                    queue.add(new int[]{i,j});
                }else{
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int i = curr[0], j = curr[1]; 
            for(int[] dir: dirs){
                int r= i+ dir[0];
                int c= j+ dir[1];
                if(r<0 || r== row || c<0 || c==col || matrix[r][c] <= matrix[i][j]+1) continue;
                matrix[r][c] = matrix[i][j]+1;
                queue.add(new int[]{r,c});
            }
        }
        return matrix;
    }
}