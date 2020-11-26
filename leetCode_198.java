class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int dp[] = new int[n];
        for(int i=0; i<n;i++){
            if(i-2 >= 0){
                dp[i] = nums[i] + Math.max(dp[i-1]-nums[i-1], dp[i-2]) ;
            }else{
                dp[i] = nums[i];
            }
        }
        return Math.max(dp[n-1], dp[n-2]);
    }
}