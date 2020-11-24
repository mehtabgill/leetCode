// class Solution {
//     public List<String> letterCombinations(String digits) {
//         List<String> res = new ArrayList<>();
//         for(int i=0; i<digits.length() ; i++){
//             int num = Integer.parseInt(digits.substring(i, i+1));
//             List<String> charNum = getDigits(num);
//             if(res.size() < 3){
//                 res.addAll(charNum);
//             }else{
//                 int limit = res.size();
//                 for(int j=0; j < limit ; j++){
//                     String s = res.get(0);
//                     res.remove(0);
//                     for(String t: charNum){
//                         String temp = s.concat(t);
//                         res.add(temp);
//                     }
//                 }
//             }
//         }
//         return res;
//     }


// List<String> getDigits(int num){
//     List<String> res = new ArrayList<>();
//     if(num == 7 || num == 9){
        
//     }
//     int limit = (num-1)*3;
//     int start = limit - 3;
//      if(num == 7 ){
//         limit++;   
//     }
//     if(num == 8 ){
//         start++;
//         limit++;
//     }
//     if( num == 9){
//         start++;
//         limit +=2;
//     }
    
//     for(int i=start; i<limit; i++){
//         char c  = (char)('a' + i);
//         String s = String.valueOf(c);
//         res.add(s);
//     }
//     return res;
// }
    
    
// }




// Back Tracking

class Solution {
    
    Map<String, String> phone = new HashMap<String, String>() {{
    put("2", "abc");
    put("3", "def");
    put("4", "ghi");
    put("5", "jkl");
    put("6", "mno");
    put("7", "pqrs");
    put("8", "tuv");
    put("9", "wxyz");
  }};
    List<String> res = new ArrayList<>();
    
    
    public List<String> letterCombinations(String digits) {
        if(digits.length() != 0){
            backtrack("", digits);
        }
        return res;
    }
    
    void backtrack(String currentString, String digits){
        if(digits.length() == 0){
            res.add(currentString);
        }
        else{
            String digit = digits.substring(0, 1);
            String chars = phone.get(digit);
            for(int i=0; i <chars.length();i++){
                String s = chars.substring(i, i+1);
                
                backtrack(currentString+s, digits.substring(1));
            }
        }
    }

    
    
}