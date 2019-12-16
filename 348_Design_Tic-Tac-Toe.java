class TicTacToe {

    /** Initialize your data structure here. */
    int[] r, c, d;
    int n;
    public TicTacToe(int n) {
        int[][] mat = new int[n][n];
        r = new int[n];
        c = new int[n];
        d = new int[2];
        this.n =n;
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
        if(player ==1){
            r[row] += 1;
            c[col] += 1;
            if(row == col) d[0] +=1;
            if (row+col ==n-1) d[1] +=1;
        }else if(player == 2){
            r[row] -= 1;
            c[col] -= 1;
            if(row == col) d[0] -=1;
            if (row+col == n -1) d[1] -=1;
        }
        
        if (r[row] == n || c[col] == n ) return 1;
        else if(row == col && d[0] == n) return 1;
        else if(row + col ==n-1 && d[1] == n) return 1;
        else if (r[row] == -n || c[col] == -n ) return 2;
        else if(row == col && d[0] == -n) return 2;
        else if(row + col ==n -1 && d[1] == -n) return 2;
        else return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */