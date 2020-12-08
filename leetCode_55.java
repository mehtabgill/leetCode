class Solution {
    //     public boolean canJump(int[] nums) {
            
    //         int n = nums.length-1;
            
    //         int needed = 0;
            
    //         boolean dp[] = new boolean[n+1];
            
    //         for(int i = n; i >= 0; i--){
    //             if(nums[i] >= needed){
    //                 dp[i] = true;
    //             }
    //             else{
    //                 for(int j=1; j <=nums[i] ; j++){
    //                     if(i+j > n){
    //                         break;
    //                     }
    //                     if(dp[i+j] == true){
    //                         dp[i] = true;
    //                         break;
    //                     }
    //                 }
    //             }
    //             needed++;
    //         }
            
    //         return dp[0];
    //     }
        public boolean canJump(int[] nums) {
            
            int n = nums.length-1;
            int last = n;
           for(int i = n-1; i >=0 ; i--){
               if(i + nums[i] >= last) last = i;
           }
            return last ==0 ;
        }
    }