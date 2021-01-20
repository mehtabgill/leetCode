class Solution {
    public int subarraysDivByK(int[] A, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int currentSum = 0;
        int res = 0;
        
        map.put(0, 1);
        int sum = 0;
        for(int i=0; i<A.length; i++){
            sum = (sum+A[i]) % K;
            if(sum < 0) sum += K;
            res += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum ,0)+1);
        }
        
        return res;
    }
}