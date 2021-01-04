class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        result.add(new ArrayList<Integer>());
        Arrays.sort(nums);
        backTrack(0, nums, new ArrayList<Integer>());
        
        return result;
    }
    
    void backTrack(int start, int[] nums, List<Integer>list){
        
        for(int i=start ; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            List<Integer> ll = new ArrayList<>(list);
            ll.add(nums[i]);
            result.add(ll);
            backTrack(i+1, nums, ll);
        }
        
    }
}