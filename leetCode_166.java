class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
       
         if (numerator == 0) {
            return "0";
        }
        
        String result= "";
        result = (((numerator > 0) ^ (denominator > 0)) ? "-" : "").concat(result);
        
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        
         if(num % den == 0){
            return result.concat(String.valueOf(num/den));
        }
        
        
        HashMap<Long, Integer> map = new HashMap<>();
        
        
        
        long q = num/den;
        long r = num % den;
        
        result = result.concat(String.valueOf(q));
        result = result.concat(".");
        map.put(r, result.length());
        
        while(r != 0){
            r *= 10;
            
            q = r/den;
            
            r = r % den;
            result = result.concat(String.valueOf(q));
            
            if(map.get(r) == null){
                map.put(r, result.length());
            }else{
                int post = map.get(r);
                result = result.substring(0, post) + '(' + result.substring(post, result.length()) + ')';
                break;
            }

        }
        
        return result;
    }
}