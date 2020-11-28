// class Solution {
//     public boolean wordBreak(String s, List<String> wordDict) {
//         int n = s.length();
//         boolean dp[] = new boolean[n];
//         HashSet<String> set = new HashSet<>();
//         for(String ss: wordDict){
//             set.add(ss);
//         }
//         for(int i=0; i<n; i++){
//             if(dp[i] == false && set.contains(s.substring(0, i+1))){
//                 dp[i] = true;
//             }
//             if(dp[i]){
//                 if(i == n-1){
//                     return true;
//                 }
//                 for(int j=i+1; j<n ; j++){
//                     if(dp[j]==false && set.contains(s.substring(i+1, j+1))){
//                         dp[j] = true;
//                     }
//                     if(dp[j] && j == n-1){
//                          return true;
//                     }
//                 }
                
//             }
//         }
        
//         return false;
//     }
// }

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean dp[] = new boolean[n+1];
        HashSet<String> set = new HashSet<>();
        for(String ss: wordDict){
            set.add(ss);
        }
        dp[0] = true;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i;j++){
                if(dp[j] && set.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        
        }
        
        return dp[n];
    }
}