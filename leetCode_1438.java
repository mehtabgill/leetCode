class Solution {
    public int longestSubarray(int[] nums, int limit) {
        
        int left = 0;
        int res = 0;
        int max = nums[left], min = nums[0];
        List<Integer> ll = new ArrayList();

        Deque<Integer> maxd = new ArrayDeque<>();
        Deque<Integer> mind = new ArrayDeque<>();
        int right=0;
        for(; right < nums.length; right++){
            while(maxd.size() > 0 && nums[right] > maxd.peekLast()) maxd.pollLast();
            while(mind.size() > 0 && nums[right] < mind.peekLast()) mind.pollLast();
            maxd.add(nums[right]);
            mind.add(nums[right]);
            if(maxd.peek() - mind.peek() > limit){
                if(nums[left] == mind.peek()) mind.poll();
                if(nums[left] == maxd.peek()) maxd.poll();
                left++;
            }
           
        }
        
        return right-left;
    }
}