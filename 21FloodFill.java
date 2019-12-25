class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        helper(image,sr,sc,newColor, image[sr][sc]);
        return image;
    }
    
    public void helper(int[][] image, int sr, int sc, int newColor, int center){
        if(sr< 0 || sc< 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != center) return ;
        
            image[sr][sc] = newColor;
            helper(image,sr+1,sc,newColor, center);
            helper(image,sr-1,sc,newColor, center);
            helper(image,sr,sc+1,newColor, center);
            helper(image,sr,sc-1,newColor, center);
    }
   
}


