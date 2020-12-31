class Solution {
    public int minOperations(int[] nums, int x) {
        
        //find longest sub array with sum equal to totalSum - x
        
        // all positive so
        
       int target = -x;
       for (int num : nums) target += num;
        if(target == 0 ) return nums.length;
        int res = Integer.MIN_VALUE;
        int curSum =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i=0; i < nums.length; i++){
            curSum += nums[i];
            if(map.containsKey(curSum - target)){
                res = Math.max(res, i - map.get(curSum - target));
            }
            map.put(curSum, i);
        }
        
        if(res == Integer.MIN_VALUE) return -1;
        
        return nums.length - res;
    }
}