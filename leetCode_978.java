class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length == 1) return 1;
        
        int[] dp = new int[arr.length];
        int res =0;
        int prev = 0;
        for(int i=1; i<arr.length; i++){
            int comp = Integer.compare(arr[i], arr[i-1]);
            if(comp == 0) dp[i] = 1;
            else if(prev == comp || (prev == 0 && comp != 0) ) dp[i] =2;
            else if( (prev == 1 && comp == -1) || (prev == -1 && comp == 1)) dp[i] = dp[i-1]+1;
            res = Math.max(res, dp[i]);
            prev = comp;
        }
        return res;
    }
}