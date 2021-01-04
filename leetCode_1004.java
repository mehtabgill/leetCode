class Solution {
    public int longestOnes(int[] A, int K) {
        int res = 0;
        int left = 0;
        int[] count= new int[2];
        for(int right=0; right<A.length; right++){
            count[A[right]]++;
            while((right-left+1) - count[1] > K){
                count[A[left]]--;
                left++;
            }
            res = Math.max(right-left+1, res);
        }
        return res;
    }
}