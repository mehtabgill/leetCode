class Solution {
    public void rotate(int[][] matrix) {
        
        //transpose 
        int start=0;
        for(int i=start; i<matrix[0].length; i++){
            for(int j=start; j<matrix.length; j++){
                int temp = matrix[j][i] ;
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
            start++;
        }
        
        
        //reverse columns
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<=(matrix[0].length-1)/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length -1 -j];
                matrix[i][matrix.length -1 -j] = temp;
            }
        }
    }
}