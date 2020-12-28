class Solution {
    public int countSquares(int[][] matrix) {
        int count = 0;
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        
        for(int i=1; i < dp.length; i++){
            for(int j=1; j < dp[0].length; j++){
                if(matrix[i-1][j-1] == 1){
                    int min = Math.min(dp[i-1][j], dp[i][j-1]);
                    min = Math.min(min, dp[i-1][j-1]);
                    dp[i][j] = min + 1;
                    count+= dp[i][j];
                }
            }
        }
        
        return count;
    }
}