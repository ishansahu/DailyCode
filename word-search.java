class Solution {
    
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; ++i){
            for(int j=0; j<board[0].length; ++j){
                if(helper(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }
    
    public boolean helper(char[][] board, String word, int r, int c, int pos){
        if(pos==word.length()) return true;
        if(r<0 || r==board.length || c<0 || c==board[0].length || pos==word.length() || board[r][c] != word.charAt(pos) || board[r][c]=='#') return false;
        
        char curr = board[r][c];
        board[r][c] = '#';
        boolean flag= helper(board, word, r+1,c, pos+1) || helper(board, word, r-1,c, pos+1) || helper(board, word, r,c+1, pos+1) || helper(board, word, r,c-1, pos+1);
        board[r][c]=curr;
        return flag;
    }
}