class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums == null || nums.length==0) return new ArrayList();
        int n = nums.length;
        boolean[] arr = new boolean[n];
        HashSet<String> set = new HashSet();
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);
        helper(nums, res, new ArrayList(), set, arr,0);
        return res;    
    }
    
    private void helper(int[] nums, List<List<Integer>> res, List<Integer> lst, HashSet<String> set, boolean[]arr, int idx){
        if(lst.size() == nums.length){
            StringBuilder sb = new StringBuilder();
            for(int num : lst){
                sb.append('*');
                sb.append(num);
            }
            if(!set.contains(sb.toString())){
                res.add(new ArrayList(lst));
                set.add(sb.toString());
            }
            return;
        }
        for(int i=0; i<nums.length; ++i){
            if(arr[i]) continue;
            if(i>0 && nums[i-1] == nums[i] && !arr[i-1]) continue;
            lst.add(nums[i]);
            arr[i] = true;
            helper(nums,res, lst,set,arr,i+1);
            lst.remove(lst.size()-1);
            arr[i] = false;
        }
    }
}