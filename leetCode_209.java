class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE; 
        int start = 0 ;
        
        int tot=0;
        for(int i=0; i < nums.length; i++){
            tot += nums[i];
            while(tot >= s){
                res = Math.min(res, i - start + 1);
                tot -= nums[start++];
            }
        }
    
    
        return res == Integer.MAX_VALUE ? 0 : res;    
    }
}