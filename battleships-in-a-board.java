class Solution {
    public int countBattleships(char[][] board) {
        int res =0;
        for(int i=0; i<board.length; ++i){
            for(int j=0; j<board[0].length; ++j){
                if(board[i][j] =='X'){
                    ++res;
                    helper(board, i,j);
                }
            }
        }
        return res;
    }
    
    public void helper(char[][] board, int r, int c){
        if(r>=board.length || r<0 || c>=board[0].length || c<0 || board[r][c] == '.') return ;
            board[r][c] ='.';
            helper(board, r-1,c);
            helper(board, r+1,c);
            helper(board, r,c-1);
            helper(board, r,c+1);
    }
}