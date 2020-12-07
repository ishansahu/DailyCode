class Solution {
    public int search(ArrayReader reader, int target) {
        int start = 0;
        int end =1;
        while(reader.get(end) <target){
            start = end+1;
            end = start*2;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            int curr = reader.get(mid);
            if(curr == target) return mid;
            else if(curr>target) end = mid-1;
            else start = mid+1;
        }
        return -1;
        
        
        
    }
}