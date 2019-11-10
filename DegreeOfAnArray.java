class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(), first = new HashMap<>();
        int res=0,degree =0;
        for(int i=0; i< nums.length; i++){
            first.putIfAbsent(nums[i],i);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(degree < map.get(nums[i])){
                degree = map.get(nums[i]);
                res = i+1-first.get(nums[i]);    
            }else if(degree == map.get(nums[i])){
                res = Math.min(res,i+1-first.get(nums[i]));
            }
        }
        return res;
    }
}