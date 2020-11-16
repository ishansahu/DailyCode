class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int n1 = num1.length, n2 = num2.length;
        if(n1>n2){
            int[] temp = num2;
            num2 = num1;
            num1 = temp;
            int len = n1;
            n1=n2;
            n2=len;
        }
        int l=0, r = n1;
        int half = (n1+n2+1)/2;
        while(l<=r){
            int i = l+(r-l)/2;
            int j = half - i;
            if(i<r && num1[i]<num2[j-1]) l = i+1;
            else if(i>l && num2[j]<num1[i-1]) r = i-1;
            else{
                int maxLeft = 0;
                if(i==0) maxLeft = num2[j-1];
                else if (j==0) maxLeft = num1[i-1];
                else maxLeft = Math.max(num1[i-1],num2[j-1]);
                if((n1+n2)%2==1) return maxLeft;
                
                int minRight = 0;
                if(i==n1) minRight = num2[j];
                else if (j==n2) minRight = num1[i];
                else minRight = Math.min(num1[i],num2[j]);
                return (maxLeft+minRight)/2.0;
            } 
        }
        return 0.0;
    
    }
    
}