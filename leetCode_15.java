class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> myCoords = new ArrayList<>();
        
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=0 ; i <= nums.length -3 ; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    myCoords.add(Arrays.asList(nums[i], nums[j], nums[k]));
                         while( j < nums.length-2 &&nums[j] == nums[j+1]){
                            j++;
                        }
                     while(k > i+2 && nums[k] == nums[k-1]){
                        k--;
                    }
                     j++;
                    k--;
                }
                else if(sum < 0 ){
                    j++;
                }else{
                    k--;
                }
              
            }
            while(i <= nums.length-3 && nums[i] == nums[i+1]){
                i++;
            }
        }
        
        return myCoords;
        
        
    }
}