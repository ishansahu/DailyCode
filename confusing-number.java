class Solution {
    public boolean confusingNumber(int N) {
        if(N==0) return false;
        int[] arr = new int[10];
        arr[1] = 1;
        arr[6] = 9;
        arr[9] = 6;
        arr[8] = 8;
        arr[2] = -1;
        arr[3] = -1;
        arr[4] = -1;
        arr[5] = -1;
        arr[7] = -1;
        String res = N+"";
        StringBuilder sb = new StringBuilder();
        while(N>0){
            //System.out.println(arr[N%10]);
            if(arr[N%10] ==-1) return false;
            sb.append(arr[N%10]);
            N/=10;
        }
        
        return !res.equals(sb.toString());
    }
    
    
}