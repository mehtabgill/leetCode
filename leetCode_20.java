class Solution {
    
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for(int i=0; i< s.length(); i++){
            if(s.substring(i, i+1).equals("(") || s.substring(i, i+1).equals("[") || s.substring(i, i+1).equals("{")){
                stack.push(s.substring(i, i+1));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(s.substring(i, i+1).equals(")") ){
                    if(!stack.peek().equals("(")) return false;
                    stack.pop();
                }
                else if(s.substring(i, i+1).equals("}")){
                    if(!stack.peek().equals("{")) return false;
                    stack.pop();
                }
                else if(s.substring(i, i+1).equals("]")){
                    if(!stack.peek().equals("[")) return false;
                    stack.pop();
                }
            
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
            return true;
    }
                        
}