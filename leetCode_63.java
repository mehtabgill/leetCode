class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        if(obstacleGrid[0][0] == 1 || obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1] ==1) return 0;
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        
        for(int row=0; row<obstacleGrid.length; row++){
            for(int col =0; col < obstacleGrid[0].length; col++){
                if(obstacleGrid[row][col] != 1){
                    if(row == 0){
                        if( col == 0 || (dp[row][col-1] != -1)) dp[row][col] = 1;
                        else dp[row][col] = -1;
                    }else if(col == 0 ){
                        if(row == 0 || (dp[row-1][col] != -1)) dp[row][col] = 1;
                         else dp[row][col] = -1;
                    }
                    else if(row > 0 && col > 0) {
                        dp[row][col] = (dp[row-1][col] == -1 ? 0 : dp[row-1][col]) + (dp[row][col-1] == -1 ? 0 : dp[row][col-1]);
                    }
                }else{
                    dp[row][col] = -1;
                }
            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}