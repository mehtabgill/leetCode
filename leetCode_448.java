class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            int num = nums[i] % nums.length == 0 ? nums.length : nums[i] % nums.length;
            nums[num-1] += nums.length;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= nums.length){
                result.add(i+1);
            }
        }
        return result;
    }
}