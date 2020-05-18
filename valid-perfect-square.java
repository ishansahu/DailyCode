class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1, r=num/2+1;
        while(l<r){
            long mid = l + (r-l)/2;
            if(mid * mid == num) return true;
            else if(mid * mid <num) l = (int)mid+1;
            else r=(int)mid-1;
        }
        return l*l==num? true:false;
    }
}/Users/ishansahu/Downloads/ravenous-part-two-solution/src/components/BusinessList/BusinessList.js