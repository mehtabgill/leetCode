// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         int current = 0 ;
//         boolean result = true;
//         if(s.length() == 0){
//             return true;
//         }
//         for(int i=0; i < t.length(); i++){
//             if(s.charAt(current) == t.charAt(i)){
//                 current++;
//             }
//             if(current == s.length()){
//                 return true;
//             }
//         }
//         if(current < s.length()){
//             return false;
//         }
//         return result;
//     }
// }

class Solution {
    public boolean isSubsequence(String s, String t) {
        int current = 0 ;
        boolean result = true;
        if(s.length() == 0){
            return true;
        }
        for(int i=0; i < s.length(); i++){
            int indi = t.indexOf(s.charAt(i), current);
            if(indi < current){
                return false;
            }
            current=indi+1;
        }
        
        return result;
    }
}