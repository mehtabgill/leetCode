class Solution {
    public int[] dailyTemperatures(int[] T) {
        
        Stack<Integer> stack = new Stack<>();
        
        int res[] = new int[T.length];
        
        for(int i=0; i < T.length ; i++){
            while(!stack.isEmpty() && T[i] > T[stack.peek()]){
                int count = i - stack.peek() ;
                res[stack.pop()] = count;
            }
            stack.push(i);
        }
        return res;
    }
}