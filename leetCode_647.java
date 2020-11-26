class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        if(n == 0){
            return 0;
        }
        boolean dp[][] = new boolean[n][n];
        int res = 0;
        for(int i=n-1; i>=0;i--){
            for(int j=i; j<n ; j++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j-i < 3 || dp[i+1][j-1]);
                
                if(dp[i][j]){
                    res++;
                }
            }
        }
        
        return res;
    }
}