class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        int res = -1;
        
        Arrays.sort(nums);
        
        int left=0, right=nums.length-1;
        
        while(left < right){
            int sum = nums[left] + nums[right];
            
            if(sum < k){
                res = Math.max(sum, res);
                left++;
            }else{
                right--;
            }
        }
        
        
        return res;
    }
}