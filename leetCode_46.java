class Solution {
    List<List<Integer>> result = new ArrayList<>(0);
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        backtrack(0, ll, list);
        return result;
    }
    
    
    void backtrack(int current, List<Integer> list, List<Integer> nums){
        if(nums.size() <= 0){
            List<Integer> ll = new ArrayList<>(list);
            result.add(ll);
            return;
        }
        
        for(int i=0; i<nums.size() ; i++){
            int safe = nums.get(i);
            list.add(safe);
            
            nums.remove(i);
            backtrack(i, list, nums);
            list.remove(list.size()-1);
            nums.add(i,  safe);
        }
    }
}