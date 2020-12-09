class Solution {
    public boolean search(int[] nums, int target) {
        
        if(nums.length <= 0) return false;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target) return true;
            else if(nums[mid] == nums[left] && nums[mid] == nums[right]){
                left++;
                right--;
            }
            else if(nums[mid] >= nums[left]){
                if(target >= nums[left] && target < nums[mid]){
                    right = mid;
                }else{
                    left=mid+1;
                }
            }else{
                if(target > nums[mid] && target <= nums[right]){
                    left=mid+1;
                }else{
                    right=mid;
                }
            }
        }
        
        return false;
    }
}