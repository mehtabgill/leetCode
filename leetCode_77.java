class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ll = new ArrayList<>();
        backTrack(1, n, ll, k);
        return result;
    }
    
    void backTrack(int currentNum, int lastNum, List<Integer>list, int k){
        
        if(list.size() == k){
            List<Integer> ll = new ArrayList<>(list);
            result.add(ll);
            return;
        }
        
        for(int i=currentNum; i<=lastNum; i++){
           list.add(i);
            backTrack(i+1, lastNum, list, k);
            list.remove(list.size()-1);
        }
        
        
    }
}