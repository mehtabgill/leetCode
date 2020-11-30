class Solution {
    private static final int MOD = 1000000007;
    public int numSubseq(int[] nums, int target) {
        
        long exp[] = new long[nums.length+1];
        exp[0] = 1;
        for(int i=1; i<exp.length;i++){
            exp[i] = exp[i-1]*2  % MOD;
        }
        Arrays.sort(nums);
        
        int left = 0, right = nums.length-1;
         long count=0;
        
        while(left <= right){
            
            if(nums[left] + nums[right] <= target){
                long num = exp[right - left] ; // we do permutation to include/exclude from left +1 to right
                count += num % MOD ;
                left++;
            }else{
                right--;
            }
        }
        
        
        return (int) (count % MOD);
    
    }
}