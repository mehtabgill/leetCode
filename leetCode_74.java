class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = -1;
        // search row
        for(int i=0; i < matrix.length; i++){
            if(target >= matrix[i][0] && target <= matrix[i][matrix[0].length-1]){
                row = i;
                break;
            }
        }
        
        if(row == -1){
            return false;
        }
        
        // binary search on the row
        
        int start = 0, end= matrix[0].length-1;
        
        while(start <= end){
            int mid = (start+end)/2;
            if(matrix[row][mid] == target) return true;
            else if(target > matrix[row][mid]) start = mid+1;
            else{
                end = mid-1;
            }
        }
        
        return false;
    }
}