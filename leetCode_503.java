class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack  = new Stack<Integer>();
        int res[] = new int[nums.length];
        Arrays.fill(res, -1);
        int n = nums.length;
        for(int i=0; i < n*2 ; i++){
            while(!stack.isEmpty() && nums[i % n] > nums[stack.peek()]){
                res[stack.pop()] = nums[i % n];
            }
            stack.push(i % n);
        }
        return res;
    }
}