class Solution {
    public class pair{
        int min;
        int max;
        
        public pair(int a, int b){
            min=a;
            max=b;
        }
        
    }
    public boolean find132pattern(int[] nums) {
        
        Stack<pair> stack = new Stack<>();
        
        for(int n: nums){
            if(stack.isEmpty() || n < stack.peek().min) stack.push(new pair(n,n));
            else if( n > stack.peek().min){
                pair last = stack.pop();
                if(n < last.max) return true;
                while(!stack.isEmpty() && n > stack.peek().max) stack.pop();
                if(!stack.isEmpty() && n > stack.peek().min) return true;
                last.max = n;
                stack.push(last);
            }
        }
        
        return false;
        
        
    }
}