class Solution {
    public int[][] generateMatrix(int n) {
     
        int[][] result = new int[n][n];
        
        int minRow = 0 , minCol = 0, maxRow = n-1, maxCol = n-1;
        int cur = 1;
        while(cur <= (n*n)){
            
            // upperWall
            for(int i=minCol; i <= maxCol && cur <= (n*n); i++){
                result[minRow][i] = cur++;
            }
            minRow++;
            // rightWall
            for(int i=minRow; i <= maxRow && cur <= (n*n); i++){
                result[i][maxCol] = cur++;
            }
            maxCol--;
            //bottom wall
            for(int i=maxCol; i >= minCol && cur <= (n*n); i--){
                result[maxRow][i] = cur++;
            }
            maxRow--;
            //left wall
            for(int i=maxRow; i >= minRow && cur <= (n*n); i--){
                result[i][minCol] = cur++;
            }
            minCol++;
        }
        
        return result;
    }
}