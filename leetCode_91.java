// class Solution {
//     public int numDecodings(String s) {
//         int n = s.length();
//         int dp[] = new int[n+1];
//         dp[0] = 1;
//         dp[1] = s.charAt(0) == '0' ? 0 : 1;
        
//         for(int i=2; i<= n; i++){
//             int c = Integer.parseInt(s.substring(i-1, i));
//             int p = Integer.parseInt(s.substring(i-2, i));
//             if(c >=1 && c <=9){
//                 dp[i] += dp[i-1];
//             }
//             if(p >= 10 && p <=26){
//                 dp[i] += dp[i-2];
//             }
//         }
        
        
//         return dp[n];
//     }
// }


class Solution {
    int res = 0;
    public int numDecodings(String s) {
        if(s.length() == 1 && s.charAt(0) == '0') return 0;
       if(s.length() == 1) return 1;
        rec(s, 0);
        return res;
        
    }
    
    void rec(String s, int i){
        if(i == s.length()){
            res+=1;
            return;
        }
       int c = s.charAt(i);
        if(c >= '1' && c <= '9'){
            rec(s, i+1);
        }
        
        if(i < s.length() -1 && (s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i+1) < '7')){
            rec(s, i+2);
        }
        
        
    }
}