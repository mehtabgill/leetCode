class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int len;
        if(s==null || (len = s.length())==0) return 0;
        int num = 0;
        char sign = '+';
       for(int i=0; i < len ; i++){
           if(Character.isDigit(s.charAt(i))){
               num =  num*10+s.charAt(i) - '0';
           }
           if(( !Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ') || i == len-1){
               if(sign == '-'){
                   stack.push(-num);
               }
               if(sign == '+'){
                   stack.push(num);
               }
                if(sign == '*'){
                   stack.push(stack.pop()*num);
               }
               if(sign == '/'){
                   stack.push(stack.pop()/num);
               }
              
               sign = s.charAt(i);
               num = 0;
           }
           
       }
        int res = 0;
        System.out.println(stack);
        for(int i: stack){
            res += i;
        }
        
        return res;
    }
    
   
}