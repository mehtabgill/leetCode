class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i =0 ; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                int rhs = stack.pop();
                int lhs = stack.pop();
                stack.push(lhs+rhs);
            }
            else if(tokens[i].equals("*")){
                int rhs = stack.pop();
                int lhs = stack.pop();
                stack.push(lhs*rhs);
            }
           else if(tokens[i].equals("/")){
                int rhs = stack.pop();
                int lhs = stack.pop();
                stack.push(lhs/rhs);
            }
           else if(tokens[i].equals("-")){
                int rhs = stack.pop();
                int lhs = stack.pop();
                stack.push(lhs-rhs);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}