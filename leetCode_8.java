class Solution {
    public int myAtoi(String s) {
        
        if(s.length() == 0) return 0;
        int left = 0 ;
        while(left < s.length() && s.charAt(left) == ' ' ){
            left++;
        }
        
       if(left == s.length()) return 0;
        
        int sign = 1;
        
        if(s.charAt(left) == '+' || s.charAt(left) == '-'){
            sign = s.charAt(left) == '-' ? -1 : 1;
            left++;
        }
        
        
        int res=0;
    
        
        while(left < s.length()){
            
            int digit = (int)(s.charAt(left) - '0');
            if(digit < 0 || digit > 9) break;
            if(res > Integer.MAX_VALUE/10 || res == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10){
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            
            res = res*10 + digit;
            left++;
        }
        
        
        return sign*res;
    }
}