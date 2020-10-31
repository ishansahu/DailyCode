class Solution {
    public boolean equationsPossible(String[] equations) {
        HashMap<Character, Character> parent = new HashMap();
        
        for(String eq : equations){
            parent.put(eq.charAt(0),eq.charAt(0));
            parent.put(eq.charAt(3),eq.charAt(3));
        }
        
        for(String eq : equations){
            char s = find(eq.charAt(0),parent);
            char d = find(eq.charAt(3),parent);
            if(eq.charAt(1)=='!'){
                if(s==d) return false;
            }else{
                parent.put(d,s);
            } 
        }
        for(String eq : equations){
            char s = find(eq.charAt(0),parent);
            char d = find(eq.charAt(3),parent);
            if(eq.charAt(1)=='!'){
                if(s==d) return false;
            }else{
                parent.put(d,s);
            } 
        }
        return true;
    }
    
    public char find(char ch, HashMap<Character, Character> parent){
        return parent.get(ch)==ch?ch:find(parent.get(ch),parent);
    }
}