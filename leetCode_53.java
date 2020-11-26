// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         if(n== 0){
//             return 0;
//         }
//         int res = nums[0];
//         int dp[][] = new int[n][n];
//         for(int i=n-1; i>=0 ; i--){
//             for(int j=i; j < n ; j++){
//                 if(i == j ){
//                     if(nums[i] > res){
//                         res = nums[i];   
//                     }
//                     continue;
//                 }
//                 if(j-i == 1){
//                     dp[i][j] = nums[i] + nums[j];
//                 }else{
//                     dp[i][j] = nums[i] + dp[i+1][j];
//                 }
//                 if(dp[i][j] > res){
//                     res = dp[i][j];
//                 }
//             }
//         }
//         return res;
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        
        int res = nums[0];
        dp[0] = nums[0];
        
        for(int i=1; i<n;i++){
            dp[i] =nums[i] + (dp[i-1] < 0 ? 0 : dp[i-1]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}