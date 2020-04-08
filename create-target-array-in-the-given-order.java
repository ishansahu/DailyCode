class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> res = new ArrayList();
        for(int i=0; i<index.length; ++i){
            int temp = index[i];
            if (res.size() >= temp) res.add(temp,nums[i]);
            else res.add(nums[i]);
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}