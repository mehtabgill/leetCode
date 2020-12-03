class Solution {
    public int maximalSquare(char[][] matrix) {
        int dp[][] = new int[matrix.length+1][matrix[0].length+1];
        
        int max = 0;
        
        for(int i=1 ; i < dp.length ; i++){
            for(int j=1 ; j < dp[0].length ; j++){
                if(matrix[i-1][j-1] == '1'){
                    int min = Math.min(dp[i-1][j], dp[i-1][j-1]);
                    min = Math.min(dp[i][j-1], min);
                    dp[i][j] = min+1;
                    if(dp[i][j] > max) max = dp[i][j];
                }
            }
        }
        
        return max*max;
    }
}