class Solution {
    public int[] replaceElements(int[] arr) {
        int temp = -1;
        for(int i= arr.length-1; i>=0;--i ){
            int curr = arr[i];
            arr[i] = temp;
            temp = Math.max(curr, temp);
        }
        return arr;
    }
}