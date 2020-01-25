class Solution {
    public int pathSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int num : nums){
            map.put(num/10, num%10);
        }
        return helper(map, nums[0]/10, 0);
    }
    
    public int helper(HashMap<Integer, Integer> map,int curr, int presum){
        if( !map.containsKey(curr)) return 0;
        int left = (curr/10 +1)*10 +((curr%10 )*2 -1);
        int right = (curr/10 +1)*10 +(curr%10 *2);
        int currsum = presum + map.get(curr);
        if( !map.containsKey(left) && !map.containsKey(right)) return currsum;
        return helper(map, left,currsum) + helper(map, right,currsum) ;
    }
}