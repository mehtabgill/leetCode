class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        int res = 0;
        int sum = 0;
        int[] prevSum = new int[A.length+1];
        prevSum[0] = 1;
        for(int i= 0; i < A.length; i++){
            sum += A[i];
            if(sum >= S)
                res += prevSum[sum - S];
            prevSum[sum]++;
        }
        return res;
    }
    
}