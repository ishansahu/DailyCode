class Solution {
    public String generateTheString_ori(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n-1; i++) sb.append('a');
        if(n%2 == 0){
            sb.append('b');
            return sb.toString();
        } 
        sb.append('a');
        return sb.toString();
    }
    
    public String generateTheString(int n) {
        return "b" + "ab".substring(n%2,1+n%2).repeat(n-1);
    }
}