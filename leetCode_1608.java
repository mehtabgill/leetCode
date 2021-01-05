class Solution {
    public int specialArray(int[] nums) {
       
        Arrays.sort(nums);
        for(int i=0; i< nums.length ; i++){
            int count = nums.length - i;
            if(count <= nums[i] && (i == 0 || count > nums[i-1]) ) return count;
        }
            
            
        return -1;
    }
}