class Solution {
    public boolean isRobotBounded(String instructions) {
        char curr = 'N';
        HashMap<Character, Pair<Integer, Integer>> dirs = new HashMap();
        dirs.put('N', new Pair<>(0,1));
        dirs.put('E', new Pair<>(1,0));
        dirs.put('W', new Pair<>(-1,0));
        dirs.put('S', new Pair<>(0,-1));
        int x =0, y=0;
        boolean flag =false;
        for(int i=0; i<4;++i){
            for(char ch : instructions.toCharArray()){
                    if(ch == 'G'){
                        Pair p = dirs.get(curr);
                        x += (int)p.getKey();
                        y += (int)p.getValue();
                    }else{
                      curr = helper(curr,ch);
                    } 
            }
            if(x==0 && y==0) return true;
        }
        return x==0 && y==0;
    }
    
    public char helper(char curr, char dir){
        char res;
        if(curr == 'N'){
            if(dir == 'L') res = 'W';
            else res = 'E';
        }else if(curr == 'E'){
            if(dir == 'L') res = 'N';
            else res = 'S';
        }else if(curr == 'W'){
            if(dir == 'L') res = 'S';
            else res = 'N';
        }else{
            if(dir == 'L') res = 'E';
            else res = 'W';
        }
        return res;
    }
}