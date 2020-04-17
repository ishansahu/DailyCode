class Solution {
    public String stringShift(String s, int[][] shift) {
        StringBuilder sb = new StringBuilder(s);
        for(int[] arr : shift){
            if(arr[0] ==0){
                for(int i=0; i<arr[1]; ++i) sb.append(sb.charAt(i));
                sb= sb.delete(0,arr[1]);
            }else{
                for(int i=0; i<arr[1];++i) sb.insert(0,sb.charAt(sb.length()-1-i));
                sb = sb.delete(sb.length()-arr[1], sb.length());
            }
        }
        return sb.toString();
    }
}