class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = new int[101];
        for(int i=0; i<heights.length; ++i) ++arr[heights[i]];
        int res=0, curr=0;
        for(int i=0; i<heights.length;++i){
            while(arr[curr] ==0) ++curr;
            if(curr !=heights[i]) ++res;
            --arr[curr];
        }
        return res;
    }
}