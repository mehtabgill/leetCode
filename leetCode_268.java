class Solution {
    public int missingNumber(int[] nums) {
        
        int len = nums.length;
        
        int sum = 0 ;
        
        for(int i=1; i <= len; i++){
            sum += i;
        }
        
        int curS = 0;
        
        for(int i =0; i < nums.length; i++){
            curS += nums[i];
        }
        
        return sum - curS;
    }
    
}