class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i < nums.length; i++){
            int num = nums[i] % nums.length == 0 ? nums.length : nums[i] % nums.length;
            if(nums[num-1] > nums.length){
                result.add(num);
            }else {
                nums[num-1] += nums.length;
            }
        }
        return result;
    }
}