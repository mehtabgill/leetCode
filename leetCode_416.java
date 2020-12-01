class Solution {
    public boolean canPartition(int[] nums) {
        int arraySum = 0;
        for(int i: nums){
            arraySum += i;
        }
        if(arraySum % 2 != 0) return false;
        
        return checkPartion(nums, arraySum/2);
        
    }
    
    
    boolean checkPartion(int[] nums, int s){
        int dp[]= new int[s+1];
        dp[0] =1;
        for(int i: nums){
            for(int j=s; j>=i; j-- ){
                dp[j] += dp[j-i];
            }
            if(dp[s] > 0){
                return true;
            }
        }
        return false;
    }
}