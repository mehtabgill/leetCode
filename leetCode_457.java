class Solution {
    public boolean circularArrayLoop(int[] nums) {
        
        if(nums.length <=1 ) return false;
        
        for(int i=0; i < nums.length; i++){
            int slow = i, fast = i;
            boolean forward = nums[i] >= 0;
            while(true){
                
                slow = getNextPosition(nums, slow, forward);
                if(slow == -1) break;
                
                fast = getNextPosition(nums, fast, forward);
                if(fast == -1) break;
                
                fast = getNextPosition(nums, fast, forward);
                if(fast == -1) break;
                
                if(slow == fast) return true;
            }
        }
        
        return false;
        
    }
    
    int getNextPosition(int[] nums, int start, boolean forward){
        boolean direction = nums[start] >= 0;
        
        if(direction != forward) return -1;
        
        int next = (start + nums[start]) % nums.length;
        
        if(next < 0) next = next + nums.length;
        
        if(start == next) return -1;
        
        return next;
    }
}