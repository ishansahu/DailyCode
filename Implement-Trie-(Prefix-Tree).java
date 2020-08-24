class Trie {

    /** Initialize your data structure here. */
    TrieNode root;
    public Trie() {
        root = new TrieNode();
        
    }
    
    class TrieNode{
        TrieNode[] child = new TrieNode[26];
        boolean isEndOfWord;
        
        TrieNode(){
            isEndOfWord = false;
            for(int i=0; i<26; ++i) child[i] = null;
        }
        
    }
    /** Inserts a word into the trie. */
    public void insert(String word) {
        int len = word.length(); 
        TrieNode newNode = root; 
        for(int i =0; i< len; ++i){
            int idx = word.charAt(i) -'a';
            if(newNode.child[idx] == null)
                newNode.child[idx] = new TrieNode();
            newNode = newNode.child[idx];
        }
        newNode.isEndOfWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode newNode = root;
        int len = word.length(), i=0;
        
        while(i<len){
            int idx = word.charAt(i++)-'a';
            if(newNode.child[idx] == null) return false;
            newNode = newNode.child[idx];
            
        }
        return newNode.isEndOfWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode newNode = root;
        int len = prefix.length(), i=0;
        while(i<len){
            int idx = prefix.charAt(i++) -'a';
            if(newNode.child[idx] == null) return false;
            newNode = newNode.child[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */