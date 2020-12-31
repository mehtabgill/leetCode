class Solution {
    public int findLength(int[] A, int[] B) {
        int[][] dp = new int[A.length+1][B.length+1];
        int res = 0;
        for(int i=dp.length-2; i>=0; i--){
            for(int j=dp[0].length-2; j>=0; j--){
                if(A[i] == B[j]){
                    dp[i][j] = dp[i+1][j+1]+1;
                    res = Math.max(res, dp[i][j]);
                }
            }
        }
        
        
        return res;
    }
}