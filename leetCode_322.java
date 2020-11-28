class Solution {
    public int coinChange(int[] coins, int amount) {
       int dp[] = new int[amount+1];
        dp[0] =0;
        for(int i=1; i<=amount; i++){
            dp[i] = -1;
        }
        for(int i=1;i<=amount; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<coins.length;j++){
                if(i - coins[j] >= 0){
                    if(dp[i-coins[j]] != -1 && dp[i-coins[j]] <= min){
                        min = dp[i-coins[j]];
                    
                    }
                }
            }
            if(min != Integer.MAX_VALUE) dp[i] = min +1;
            else{
                dp[i] = -1;
            }
        }
        return dp[amount];
    }
    
}