class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        
        int limit = (int)Math.pow(2, nums.length);
        
        for(int i=0; i < limit ; i++){
            List<Integer> ll = new ArrayList<>();
            int num = i;
            for(int j= 0 ; j < nums.length; j++){
                int r = num % 2;
                num  =  num /2 ;
                if(r == 1) ll.add(nums[j]);
            }
            list.add(ll);
        }
        return list;
    }
    
    
}