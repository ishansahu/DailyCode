class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> wordset = new HashSet<>(wordList);
        if(!wordset.contains(endWord)) 
            return 0;
        Queue<String> queue = new LinkedList();
        queue.offer(beginWord);
        int res =0;
        while (!queue.isEmpty()){
            for(int i =queue.size(); i > 0;i-- ){
                String word = queue.poll();
                if(word.equals(endWord))
                    return res +1;
                for(int k=0; k< word.length(); k++){
                    char[] newword = word.toCharArray();
                    for(char ch='a'; ch<='z'; ch++){
                        newword[k] = ch;
                        String s = new String(newword);
                        if(wordset.contains(s) && !s.equals(word)){
                            queue.offer(s);
                            wordset.remove(s);
                        }
                    }
                    
                }
            }
            res++;
        }
        return 0;
    }
}