class Solution {
    public int thirdMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        List<Integer> list=new ArrayList<Integer>();
        
        for(int i = 0 ; i < nums.length; i++){
            if(list.contains(nums[i])){
                continue;
            }
            else if(list.size()<3){
                list.add(nums[i]);
                if(nums[i]<min){
                    min=nums[i];
                }
            }else if(nums[i]>min){
                    list.remove(Integer.valueOf(min));
                    list.add(nums[i]);
                    min = Collections.min(list);
            }
                
        }
        if(list.size() < 3){
            return Collections.max(list);
        }
        else{
            return min;
        }
    }
} 