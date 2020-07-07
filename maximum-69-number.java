class Solution {
    public int maximum69Number (int num) {
        int index = -1;
        int curr = num;
        for(int i=0; curr>0; ++i){
            if(curr %10== 6) index = i;
            curr /=10;
        }
        
        return index ==-1 ? num: num + 3* (int)Math.pow(10,index);
    }
}