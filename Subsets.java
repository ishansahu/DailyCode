class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, nums, new ArrayList<>(), 0);
        return list;
    }
    
    public void helper(List<List<Integer>> list, int[] nums, List<Integer> temp, int start){
        list.add(new ArrayList<>(temp));
        for(int i=start; i<nums.length; i++){
            temp.add(nums[i]);
            helper(list, nums, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
}