class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int maxSub = A[0];
        int minSub = A[0];
        
        int curMin = A[0], curMax = A[0];
        int totSum = A[0];
        for(int i=1; i < A.length; i++){
            curMin = Math.min(curMin + A[i], A[i]);
            minSub = Math.min(curMin, minSub);
            
            totSum += A[i];
            
            curMax = Math.max(curMax + A[i], A[i]);
            maxSub = Math.max(maxSub, curMax);
        }
        // System.out.println(Arrays.toString(dpMin) + " " + Arrays.toString(dpMax));
        //         System.out.println(maxSub + " " + minSub + " " + totSum);


        return maxSub > 0 ? Math.max(maxSub, totSum - minSub) : maxSub;
    }
}