class Solution {
    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        track(0, new LinkedList<>(), nums);
        return result;
    }
    
    void track(int start, LinkedList<Integer> list, int[] nums){
        
        if(list.size() >= 2) result.add(new LinkedList<>(list));
        Set<Integer> set = new HashSet<>();
        for(int i=start; i < nums.length; i++){
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            if(list.size()==0 || nums[i] >= list.peekLast()){
                list.add(nums[i]);
                track(i+1, list, nums);
                list.remove(list.size()-1);
            }
        }
    }
}