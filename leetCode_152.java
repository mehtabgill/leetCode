class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n == 0) return -1;
        int current_max = nums[0];
        int current_min = nums[0];
        int final_max = nums[0];
        
        for(int i=1; i<n; i++){
            int temp = current_max;
            current_max = Math.max(Math.max(current_max*nums[i], current_min*nums[i]), nums[i]);
            current_min = Math.min(Math.min(current_min*nums[i], temp*nums[i]), nums[i]);
            if(current_max > final_max) final_max = current_max;
        }
        
        return final_max;
    }
}