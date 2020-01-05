class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         for(int i=0; i<matrix.length; i++){
//             if (rowSearch(matrix[i], target)) return true;
//         }
//         return false;
//     }
  
     public boolean searchMatrix(int[][] matrix, int target) {
         
         if(matrix == null || matrix.length <1 || matrix[0].length< 1) return false;
         int c = matrix[0].length-1, r=0;
         while(c>=0 && r< matrix.length){
             if(target == matrix[r][c] ) return true;
             else if(matrix[r][c] > target) c--;
             else r++;
         }
         return false;
     }
    
    public boolean rowSearch(int[] row, int target){
        int low = 0, high = row.length-1;
        while(low<=high){
            int mid = (high + low+1)/2;
            if(row[mid] == target ) return true;
            else if( row[mid] > target) high = mid -1;
            else low = mid +1;
        }
        return false;
    }
}