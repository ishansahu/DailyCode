class Solution {
    public int[][] allCellsDistOrder_ori(int R, int C, int r0, int c0) {
        List<int[]> lst= new ArrayList();
        for(int i=0; i<R; ++i){
            for(int j=0; j<C; ++j){
                lst.add(new int[]{i,j});
            }
        }
        Collections.sort(lst, new Comparator<int[]>(){
            @Override
            public int compare(int[] l1, int[]l2){
                return Math.abs(l1[0]-r0) + Math.abs(l1[1]-c0) - Math.abs(l2[0]-r0) - Math.abs(l2[1]-c0);
            }
        });
        int[][] res = new int[lst.size()][2];
        for(int i=0; i<lst.size();++i){
            res[i][0] =  lst.get(i)[0];
            res[i][1] = lst.get(i)[1];
        }  
        return res;
    }
    
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        boolean[][] visited = new boolean[R][C];
        Queue<int[]> queue = new LinkedList();
        int[][] res = new int[R*C][2];
        queue.offer(new int[]{r0,c0});
        int count=0;
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            if(r<0 || r==R || c<0 || c== C ) continue;
            if(visited[r][c]) continue;
            visited[r][c] =true;
            res[count++] = curr;
            queue.offer(new int[]{r+1,c});
            queue.offer(new int[]{r-1,c});
            queue.offer(new int[]{r,c-1});
            queue.offer(new int[]{r,c+1});
        }
        return res;
    }
    
}