class Solution {
    public int compress(char[] chars) {
        int res=0, index=0;
        while(index< chars.length){
            int temp=0;
            char curr = chars[index];
            while(index < chars.length && chars[index] == curr){
                ++temp;
                ++index;
            } 
            chars[res++] = curr;
            if(temp>1){
                for(char dig : String.valueOf(temp).toCharArray()){
                    chars[res++] = dig;
                }
            } 
        }
        return res;
    }
}