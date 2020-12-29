class Solution {
    public void nextPermutation(int[] nums) {
        
        
        // find the first i where nums[i] < nums[i+1]
        
        int starter=-1;
        
        for(int i=nums.length-1; i >= 1; i--){
            if(nums[i] > nums[i-1]){
                // System.out.println(i);
                starter = i-1;
                break;
            }
        }
        
        // System.out.println(starter);
        
        // find the next greatest element to the nums[starter]
        int nextGreater = -1;
        if(starter != -1){
             for(int i=nums.length-1; i>starter; i--){
                if(nums[i] > nums[starter]){
                    nextGreater= i;
                    break;
                }
            }
        }
        
       
        if(nextGreater != -1){
            int temp = nums[starter];
            nums[starter]= nums[nextGreater];
            nums[nextGreater] = temp;
        }
        
        // reverse everything to the right of starter
        
        int left = starter+1;
        int right = nums.length-1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}