class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int count = 0 ;
        
        for(int i = 0 ; i < nums.length; i++){
            if(count < k){
                pq.offer(nums[i]);
                count++;
            }else{
                if(nums[i] > pq.peek()){
                    pq.remove();
                    pq.offer(nums[i]);
                }
            }
        }

        
        return pq.peek();
    } 
}