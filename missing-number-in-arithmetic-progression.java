class Solution {
    public int missingNumber(int[] arr) {
        int diff=(arr[1]-arr[0] !=arr[2]-arr[1])? (arr[2]-arr[0])/3 : arr[1]-arr[0];
        int i=0;
        for(i=1; i<arr.length; ++i){
            if(arr[i-1] + diff != arr[i]) return arr[i-1] + diff;
        }
        return arr[i-1] + diff;
    }
}