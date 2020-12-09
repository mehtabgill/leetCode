class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int current_sum = 0;
        map.put(current_sum, 1);
        
        int currentSum = 0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            currentSum += nums[i];
           if(map.get(currentSum - k) != null){
                count += map.get(currentSum -k);
            }
            if(map.get(currentSum) != null){
                int c = map.get(currentSum);
                c += 1;
                map.put(currentSum, c);
            }else if(map.get(currentSum) == null){
                map.put(currentSum, 1);
            }
            
             
        }
        
        return count;
    }
}