class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        
        for(int i: nums) map.put(i, true);
        
        
        for(int num: nums){
            if(map.containsKey(num-1)) map.put(num, false);
        }
        
        
        for(int key: map.keySet()){
            if(map.get(key)){
                int t=1;
                int temp = key;
                while(map.containsKey(temp+t)){
                    t++;
                }
                res= Math.max(res, t);
            }
        }
        
        
        
        
        
        
        return res;
    }
}