class Solution {

    HashMap<Integer, List<Integer>> map;
    public Solution(int[] nums) {
        map = new HashMap();
        for(int i=0; i<nums.length; ++i){
            List<Integer> curr = map.getOrDefault(nums[i],new ArrayList());
            curr.add(i);
            map.put(nums[i],curr);
        }
    }
    
    public int pick(int target) {
        if(!map.containsKey(target)) return -1;
        List<Integer> curr= map.get(target);
        return curr.get((int)(Math.random()*curr.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */