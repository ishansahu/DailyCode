class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length ==0) return -1;
        int i=0, j= nums.length-1;
        while(i<j){
            int mid = i+(j-i)/2;
            if(nums[mid]>nums[j]) i=mid+1;
            else j=mid;
        }
        if(nums[i] == target) return i;
        else if(nums[0]>target || i==0){
            j=nums.length-1;
        }else{
            j=i;
            i=0;
        }
        while(i<j){
            int mid = i + (j-i)/2;
            if(nums[mid]< target){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        return nums[i] == target ? i: -1;
        
    }
}