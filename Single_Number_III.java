class Solution {
    public int[] singleNumber_old(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int num : nums){
            if(set.contains(num))set.remove(num);
            else set.add(num);
        }
        int[] res = new int[2];
        int i=0;
        for(int num : set) res[i++] = num;
        return res;
    }
    public int[] singleNumber_1(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[2];
        int k=0;
        int i=0, j=1;
        while(j<nums.length){
            if(k==2) return res;
            if(nums[i] == nums[j]){
                i +=2;
                j +=2;
            }else{
                res[k++] = nums[i];
                i++;
                j++;
            }
        }
        res[k] = nums[j-1];
        return res;
    }
    
    public int[] singleNumber(int[] nums) {
        int sum =0;
        for(int num:nums) sum ^=num;
        int right_bit = sum &(-sum);
        int[] res = new int[2];
        for(int num : nums){
            if((right_bit & num) ==0) res[0] ^=num;
            else res[1] ^=num;
        }
        return res;
    }
    
}