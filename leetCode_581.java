class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] nums2 = nums.clone();
        Arrays.sort(nums2);
        int start = nums.length, end =0;
        
        for(int i=0; i < nums.length ; i++){
            if(nums[i] != nums2[i]){
                start = Math.min(i, start);
                end = Math.max(end, i);
            }
        }
        
        return end - start >= 0 ? end-start+1 : 0;
        
    }
}