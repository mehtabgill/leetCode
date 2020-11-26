class Solution {
    public int myAtoi(String s) {
        int start = 0;
        if(s.length() <= 0){
            return 0;
        }
        while(start < s.length() && (s.charAt(start) == ' ')){
            start++;
        }
        if(start == s.length() || !(s.charAt(start) == '-' || s.charAt(start) == '+' || Character.isDigit(s.charAt(start))) ){
            return 0;
        }
        int sign =1;
        if(s.charAt(start) == '-'){
            sign= -1;
            start++;
        }else if(s.charAt(start) == '+'){
            start++;
        }
        int i = 0;
        int prev = -1;
        System.out.println(Integer.MAX_VALUE);
        boolean warn = true;
        while(start < s.length() && Character.isDigit(s.charAt(start))){
            i = i*10 + Character.getNumericValue(s.charAt(start));
            System.out.println(start + " " + i);
            if(start > 9 || (start == 9 &&  Character.getNumericValue(s.charAt(start)) > 7)){
                 if(sign == 1 ){
                    return Integer.MAX_VALUE;
                }
                if(sign == -1 ){
                    return Integer.MIN_VALUE;
                }
            }
            prev =i;
            
            start++;
        }
        
        return i*sign;
    }
}