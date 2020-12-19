class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = 10001;
        
        int[] dp = new int[n];
        
        for(int i: nums){
            dp[i] += i;
        }
        
        int skip=0, take=0;
        for(int i=0; i<n; i++){
            int takei = skip + dp[i];
            int skipi = Math.max(skip, take);
            
            take = takei;
            skip = skipi;
        }
        
        return Math.max(skip, take);
    }
}