class Solution {
    //st = index
  public static class Pair implements Comparable<Pair> {
        int st;
        int et;
        
        Pair(int st, int et){
            this.st = st;
            this.et = et;
        }
        
        public int compareTo(Pair other){
            return other.et - this.et;
        }
    }
    
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        int i =0;
        for(; i < k -1 ; i++ ){
            pq.offer(new Pair(i, nums[i]));
        }
        
        int[] res = new int[nums.length - k + 1];
        
        int index=0;
        
        
        int left = 0;
        int right = i;
        
        for(; right<nums.length; right++){
            
            while(!pq.isEmpty() && pq.peek().st < left){
                pq.remove();
            }
            pq.offer(new Pair(right, nums[right]));
            
            res[index++] = pq.peek().et;
            
            left++;
        }
        
        return res;
    }
}