class Solution {
    public int maximumSwap(int num) {
     
        char[] nums = String.valueOf(num).toCharArray();
        
        int[] digits = new int[10];
        
        for(int i=0; i < nums.length; i++){
            digits[nums[i] - '0'] = i;
        }
        
        
        for(int i=0; i<nums.length; i++ ){
            for(int k=9; k > nums[i] - '0'; k--){
                if(digits[k] > i){
                    char temp = nums[i];
                    nums[i] = nums[digits[k]];
                    nums[digits[k]] = temp;
                    return Integer.parseInt(String.valueOf(nums));
                }
            }
        }
            
            
            
        return num;
        
    }
}