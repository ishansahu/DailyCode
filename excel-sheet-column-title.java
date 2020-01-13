class Solution {
    public String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();
        while(n >0){
            str.append((char)(--n%26+65));
            n/=26;
        }
        return str.reverse().toString();
    }
}