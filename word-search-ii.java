class Solution {
    int row, col;
    public List<String> findWords_brute(char[][] board, String[] words) {
        HashSet<String> res = new HashSet();
        for(String word : words){
            row=0;
            col=0;
            find(board, word);
            String curr = new String();
            boolean[][] visited = new boolean[board.length][board[0].length];
            helper(board, res, visited, word, curr,row,col);    
        }
        List<String> res1 = new ArrayList();
        for(String word: res) res1.add(word);
        return res1;
    }
    
    public void helper(char[][] board, HashSet<String> res, boolean[][] visited, String word, String curr, int r, int c){
        if(r<0 || r==board.length || c<0 || c==board[0].length || visited[r][c]==true) return;
        visited[r][c] = true;
        curr +=board[r][c];
        if(curr.contains(word) || curr.contains(new StringBuilder(word).reverse().toString())){
            res.add(word);
        }else{
            helper(board, res, visited, word, curr, r+1,c);
            helper(board, res, visited, word, curr, r-1,c);
            helper(board, res, visited, word, curr, r,c+1);
            helper(board, res, visited, word, curr, r,c-1);
           
        }
        visited[r][c] = false;
    }
    
    public void find(char[][] board, String word){
        for(int i=0; i<board.length;++i){
                for(int j=0;j<board[0].length; ++j){
                    if(board[i][j] == word.charAt(0)){
                        row=i;
                        col=j;
                        
                        return;
                    }
                }
            }
    }
//--------------------------------------------------------------
    
    
    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        for(String w: words){
            TrieNode curr = root;
            for(int i=0; i<w.length(); ++i){
                int pos = w.charAt(i)-'a';
                if(curr.child[pos] == null){
                    curr.child[pos] = new TrieNode();
                }
                curr = curr.child[pos];
            }
            curr.word = w;
        }
        List<String> res= new ArrayList();
        for(int i =0; i<board.length; ++i){
           for(int j=0; j<board[0].length; ++j){
               dfs(board, i,j, root, res);
           } 
        }
        return res;
        
    }
    
    public void dfs(char[][] board, int r, int c, TrieNode root, List<String> res){
        if(r<0 || r== board.length || c<0 || c==board[0].length || board[r][c]=='#'|| root.child[board[r][c]-'a']==null) return;
        
        char curr = board[r][c];
        root = root.child[curr-'a'];
        board[r][c] ='#';
        if(root.word !=null){
          res.add(root.word);
          root.word=null;
        } 
        dfs(board, r+1,c, root, res);
        dfs(board, r-1,c, root, res);
        dfs(board, r,c+1, root, res);
        dfs(board, r,c-1, root, res);
        board[r][c] = curr;
        
    }
    
    class TrieNode{
        TrieNode[] child = new TrieNode[26];
        String word;
    }
    
}