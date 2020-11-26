
// recursion

// class Solution {
//     public int uniquePaths(int m, int n) {
//         return trav(0, 0, m-1, n-1);
//     }
    
//     int trav(int i, int j, int maxi, int maxj){
//         if(i > maxi || j > maxj){
//             return 0;     
//         }
//         if(i == maxi && j == maxj){
//             return 1;
//         }
//         int res = trav( i+1,  j,  maxi,  maxj) + trav( i,  j+1,  maxi,  maxj);
//         return res;
//     }
// }

//dp


class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                if(i== 0 || j ==0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        
        return dp[m-1][n-1];
    }
    
   
}


