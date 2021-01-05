class Solution {
    
    //dp
    // public int findLongestChain(int[][] pairs) {
//                 if (pairs == null || pairs.length == 0) return 0;

//         Arrays.sort(pairs, (a, b)-> a[0] - b[0]);
//         int[] dp = new int[pairs.length];
//         Arrays.fill(dp, 1);
//         for(int i=0; i < pairs.length ; i++){
//             for(int j=i-1; j >= 0 ; j--){
//                 dp[i] = Math.max(dp[i], pairs[i][0] > pairs[j][1] ? dp[j]+1 : dp[j] );
//             }
//         }
        
//         return dp[pairs.length-1];
//     }
    
     public int findLongestChain(int[][] pairs) {
        if (pairs == null || pairs.length == 0) return 0;
        Arrays.sort(pairs, (a,b)-> a[1] - b[1]);
        int res  = 0 ;
         int i = 0;
        while(i < pairs.length){
            res++;
            int curEnd = pairs[i][1];
            // i++;
            while(i<pairs.length && pairs[i][0] <= curEnd) i++;
        }
        
        return res;
    }
    
}