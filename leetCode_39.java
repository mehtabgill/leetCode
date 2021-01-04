// class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         List<List<Integer>> list = new ArrayList<>();
//         HashMap<Integer, Set<List<Integer>>> map = new HashMap<>();
//         Set<List<Integer>> s = new HashSet<>(); 
//         s.add(new ArrayList<Integer>() {});
//         map.put(0, s);
        
//         for(int i=1; i<=target; i++){
//             Set<List<Integer>> temp = new HashSet<>(); 
//             for(int j=0; j < candidates.length ; j++){
//                 if(candidates[j] <= i){
//                     if(map.containsKey(i-candidates[j])){
//                         for(List<Integer> ll : map.get(i-candidates[j]) ){
//                             List<Integer> k = new ArrayList<>(ll);
//                             k.add(candidates[j]);
//                             Collections.sort(k);
//                             temp.add(k);
//                         }
//                     }
//                 }
//             }
//             if(temp.size() > 0) map.put(i, temp);
//         }
//         if(map.containsKey(target)) list.addAll(map.get(target));
        
//         return list;
//     }
// }

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        backtrack(0, target, new ArrayList<>(), candidates);
        return result;
    }
    
    
    void backtrack(int start, int target,  List<Integer>list, int[] nums){
        
        if(target == 0){
            List<Integer> ll = new ArrayList<>(list);
            result.add(ll);
            return;
        }
        
        for(int i=start; i < nums.length; i++){
            if(nums[i] > target) continue;
            list.add(nums[i]);
            backtrack(i, target-nums[i], list, nums);
            list.remove(list.size()-1);
        }
        
    }
    
    
    
}