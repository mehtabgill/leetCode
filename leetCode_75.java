class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0 || nums.length ==1) return;
        int start=0, current=0, end=nums.length-1;
        while(start < end && current <= end){
            if(nums[current] == 0){
                nums[current] = nums[start];
                nums[start] = 0;
                start++;
                current++;
            }else if(nums[current] == 2){
                nums[current] = nums[end];
                nums[end] = 2;
                end--;
            }else{
                current++;
            }
        }
    }
}