class Solution {
    int finalStart = -1;
    int finalend = -1;
    public int[] searchRange(int[] nums, int target) {
        bst(0, nums.length-1, target, nums);
        int res[] = {finalStart, finalend};
        return res;
    }
    
    void bst(int start, int end, int target, int[] nums){
        if(start>end) return;
        
        int mid = (start+end)/2;
        
        if(nums[mid] == target){
            if(finalStart == -1 || mid < finalStart) finalStart = mid;
            if(finalend == -1 || mid > finalend) finalend = mid;
            bst(start, mid-1, target, nums);
            bst(mid+1, end, target, nums);
        
        }
        else if(nums[mid] > target){
            bst(start, mid-1, target, nums);
        }
        else{
            bst(mid+1, end, target, nums);
        }
        
    }
}

