class Solution {
    public void solve(char[][] board) {
        if(board == null || board.length ==0 || board[0] == null || board.length==0) return;
        int row = board.length, col = board[0].length;
        
        for(int i=0; i<row; ++i){
            if(board[i][0] =='O') helper(board, i, 0);
            if(board[i][col-1] == 'O') helper(board,i, col-1);
        }
        for(int i=0; i<col; ++i){
            if(board[0][i] =='O') helper(board,0,i);
            if(board[row-1][i]=='O') helper(board,row-1,i);
        }
        
        for(int i=0; i<row; ++i){
            for(int j=0; j<col;++j){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='1') board[i][j]='O';
            }
        }
    }
    
    public void helper(char[][] board, int r, int c){
        if(r>=board.length || r<0 || c>=board[0].length || c<0 || board[r][c]=='X' || board[r][c]=='1') return;
        board[r][c]='1';
        helper(board,r-1,c);
        helper(board,r+1,c);
        helper(board,r,c-1);
        helper(board,r,c+1);
    }
    
}