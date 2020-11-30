class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int arraySum = 0 ;
        for(int i: nums){
            arraySum += i;
        }
        
        if(S > arraySum || (arraySum+S) % 2 != 0) return 0;
        
        int finalSum = (arraySum+S) / 2;
        
        return totalSubSets(nums, finalSum);
    }
    
    int totalSubSets(int[] nums, int s){
        int count = 0;
        
        int dp[] = new int[s+1];
        dp[0] = 1;
        for(int i: nums){
            for(int j=s; j>=i; j--){
                dp[j] += dp[j-i];
            }
        }
        
        return dp[s];
    }
}