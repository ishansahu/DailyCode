class Solution {
    public int findMaxLength(int[] nums) {
        int res =0, sum =0;
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i<nums.length ;++i){
            if(nums[i] == 0) sum -= 1;
            else sum +=1;
            if(sum == 0 ) res = Math.max(res, i+1);
            else if(map.containsKey(sum)) res = Math.max(res, i- map.get(sum));
            if(!map.containsKey(sum)) map.put(sum, i);
        }
        return res;
    }
}