class Solution {
    public int minAddToMakeValid(String S) {
        Stack<String> stack = new Stack<>();
        
        for(int i=0; i<S.length() ; i++){
            if(S.substring(i, i+1).equals(")")){
                if(!stack.isEmpty() && stack.peek().equals("(")){
                    stack.pop();
                    continue;
                }
            }
            stack.push(S.substring(i, i+1));
            
        }
        
        return stack.size();
    }
}