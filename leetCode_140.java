class Solution {
    
    HashSet<String> set = new HashSet<>();
    boolean[] dp;
    
    private final Map<String, List<String>> cache = new HashMap<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        dp = new boolean[s.length()+1];
        dp[0] = true;
        for(String ss: wordDict){
            set.add(ss);
        }
        
        return backTrack(s);
       
    }
    
      private boolean containsSuffix( String str) {
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.substring(i))) return true;
        }
        return false;
    }
    
    List<String> backTrack(String s){
        if(cache.containsKey(s)) return cache.get(s);
        List<String> result = new ArrayList<>();
        
        if (set.contains(s)) result.add(s);

        for(int i= 1; i < s.length(); i++){
            String left = s.substring(0, i) , right = s.substring(i);
            if(set.contains(left) && containsSuffix(right)){
                for(String ss: backTrack(right)){
                    result.add(left + " " + ss);
                }
            }
        }
        cache.put(s, result);
        
        return result;
    }
}