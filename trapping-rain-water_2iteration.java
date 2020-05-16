class Solution {
    public int trap(int[] height) {
        int[] rightMax = new int[height.length];
        int right = 0;
        for(int i= rightMax.length-1; i>=0; --i){
            rightMax[i] = Math.max(right, height[i]);
            if(height[i] > right ) right = height[i];
        }
        int res=0, left=0;
        for(int i=0; i< height.length; ++i){
            res += Math.max(Math.min(rightMax[i],left) - height[i],0);
            if(height[i] > left) left = height[i];
        }
        return res;
    }
}