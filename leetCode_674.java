class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) return 0;
        int res = 1;
        
        int left=0;
        int right = left+1;
        
        for(int i=1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                int temp = right-left+1;
                if(temp > res) res = temp;
            }
            else{
                left=i;
            }
            right++;
        }
        
        return res;
    }
}