class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        
        for(int i = s.length() -1; i >= 0;i--){
            if(s.substring(i, i+1).equals("[")){
                String str = "";
                String numString = "";
                int count = 0;
                for(int k = i-1; k >= 0 ;k--){
                    if(!s.substring(k, k+1).matches("-?\\d+(\\.\\d+)?")){
                        break;
                    }
                    numString = (s.substring(k, k+1)).concat(numString);
                    count++;
                }
                int num = Integer.parseInt(numString);
                i = i - count;
                while(!stack.isEmpty() && !stack.peek().equals("]") ){
                    str = str.concat(stack.pop());
                }
                String finalStr = "";
                for(int j=0;j<num;j++){
                    finalStr = finalStr.concat(str);
                }
                stack.pop(); // pop the ]
                stack.push(finalStr);
            }else{
                stack.push(s.substring(i, i+1));
            }
        }
        
        String res = "";
        while(!stack.isEmpty()){
            res = res.concat(stack.pop());
        }
        return res;
    }
}