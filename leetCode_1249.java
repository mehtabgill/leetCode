class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == ')'){
                if(!stack.isEmpty() && (s.charAt(stack.peek()) == '(' && s.charAt(i) == ')') ){
                    stack.pop();
                }else{
                    stack.push(i);
                }
            }
        }
        
        
        while(!stack.isEmpty()){
            int index = stack.pop();
            s = s.substring(0, index).concat(s.substring(index+1));        
        }
        return s;
    }
    
    
    
}