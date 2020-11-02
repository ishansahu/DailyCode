class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum =0;
        int[] visited = new int[nums.length];
        for(int num : nums) sum +=num;
        if(sum%k!=0) return false;
        return helper(nums, sum/k, 0, visited, 0,k);
    }
    
    public boolean helper(int[] nums, int target, int curr,int[] visited, int index, int k){
        if(k==1) return true;
        if(curr == target) return helper(nums, target, 0, visited, 0, k-1);
        for(int i=index; i<visited.length; ++i){
            if(visited[i] ==0){
                visited[i] =1;
                if(helper(nums, target, curr+nums[i], visited, i+1,k)) return true;
                visited[i]=0;
            }
        }
        return false;
    }
}