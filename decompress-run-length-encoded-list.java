class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList();
        for(int i=0; i<nums.length/2; ++i){
            int freq = nums[2*i], val = nums[2*i+1];
            for(int j=0; j <freq; ++j) res.add(val);
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}