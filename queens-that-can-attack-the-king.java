class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        boolean[][] seen = new boolean[8][8];
        for(int[] pos : queens ){
            seen[pos[0]][pos[1]] = true;
        }
        List<List<Integer>> res = new ArrayList();
        int[] dirs = new int[]{1,0,-1};
        for(int dx : dirs){
            for(int dy : dirs){
                if(dx ==0 && dy==0) continue;
                int x = king[0];
                int y = king[1];
                while(x+dx <8 && x+dx>=0 && y+dy<8 && y+dy >=0){
                    x +=dx;
                    y +=dy;
                    if(seen[x][y]){
                        res.add(Arrays.asList(x,y)); BV
                        break;
                    }
                }
            }
        }
        return res;SE
    }
}