class Solution {
    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        stack.add(Integer.MAX_VALUE);
        for(int a: arr){
            while( a >= stack.peek()){
                int mid = stack.pop();
                res += mid*Math.min(a, stack.peek());
            }
            stack.push(a);
        }
        while(stack.size() > 2){
                res += stack.pop()*stack.peek();
            }
        return res;
    }
}