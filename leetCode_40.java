class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(0, list, target, candidates);
        return result;
    }
    
    void backTrack(int current, List<Integer> list, int target, int[] cands){
        if(target == 0){
            List<Integer> ll = new ArrayList<>(list);
            result.add(ll);
            return;
        }
        
        for(int i=current ; i<cands.length; i++){
            if(i > current && cands[i-1] == cands[i]){
                continue;
            }
            if(cands[i] <= target){
                list.add(cands[i]);
                backTrack(i+1, list, target - cands[i], cands);
                list.remove(list.size()-1);
            }
            
        }
    }
}

