class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return KSum(0, 4, nums, target);
    }
    
    
    public List<List<Integer>> KSum(int start, int k, int[]nums, int target){
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(k == 2){
            int left = start, right = nums.length-1;
            while(left < right){
                int sum = nums[left] + nums[right];
                if(sum == target){
                    List<Integer> ll = new ArrayList<>();
                    ll.add(nums[left]);
                    ll.add(nums[right]);
                    result.add(ll);
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right &&  nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }
                else if(sum < target) left++;
                else {right--;}
            }
            return result; 
        }
        
            for(int i=start; i < nums.length - (k-1); i++){
                if(i > start && nums[i] == nums[i-1]) continue;
                List<List<Integer>> ll = KSum(i+1, k-1, nums, target-nums[i]);
                for(List<Integer> list: ll){
                    list.add(0, nums[i]);
                }
                result.addAll(ll);
            }
        
        
        return result; 
        
    }
}