class Solution {
    public boolean validTicTacToe(String[] board) {
        int p1=0,p2=0;
        int[] r = new int[3];
        int[] c = new int[3];
        int[] d = new int[2];
        for(int i=0; i<3;i++){
            String temp = board[i];
            for(int j=0; j<3; j++){
                if(temp.charAt(j) =='X'){
                    p1 +=1;
                    r[i] +=1;
                    c[j] +=1;
                    if(i==j) d[0] +=1;
                    if(i+j == 2) d[1] +=1;
                } 
                else if (temp.charAt(j) =='O'){
                    p2 +=1;  
                    r[i] -=1;
                    c[j] -=1;
                    if(i==j) d[0] -=1;
                    if(i+j == 2) d[1] -=1;
                }
            }
        }
        if(p1-p2 >1 || p1-p2 <0) return false;
        int res1=0,res2=0;
        for(int i=0; i<3; i++){
            if(r[i] == 3) res1++;
            else if(r[i] == -3) res2++;
            if(c[i] ==3) res1++;
            else if(c[i] ==-3) res2++;
        }
        if(d[0] ==3) res1++;
        else if(d[0] ==-3) res2++;
        if(d[1] ==3) res1++;
        else if(d[1] ==-3) res2++;
        
        if((res1 >0 && res2 >0)||(res1 >0 && p2==p1) || (res2>0 && p1>p2) ) return false;
        return true;
    }
}