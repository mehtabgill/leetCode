class Solution {
    
    static void reverse(int a[], int n) 
   { 
       int i, k, t; 
       for (i = 0; i < n / 2; i++) { 
           t = a[i]; 
           a[i] = a[n - i - 1]; 
           a[n - i - 1] = t; 
       } 
  
   }
   
   public int triangleNumber(int[] nums) {
       
       Arrays.sort(nums);
       reverse(nums, nums.length);
       
       int res = 0;
       
       for(int i=0; i < nums.length-2; i++){
           int j=i+1, k=nums.length-1;
           while(j < k){
               if(  (nums[i] + nums[j] )  > nums[k] && ((nums[j] + nums[k] )  > nums[i])  ){
                   res += k - j;
                   j++;
               }else{
                   k--;
               }
           }
           
       }
       
       
       
       return res;
   }
}