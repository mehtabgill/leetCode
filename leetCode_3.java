

// hash. set

// class Solution {
//     int result = 0;
//     public int lengthOfLongestSubstring(String s) {
//        int len = s.length();
//         Set<Character> set =  new HashSet<>();
//         int res=0, i=0, j=0;
//         while(i < len && j < len){
//             if(!set.contains(s.charAt(j))){
//                 set.add(s.charAt(j));
//                 j++;
//                 res = Math.max(res, j-i);
//             }else{
//                 set.remove(s.charAt(i));
//                 i++;
//             }
//         }
//         return res;
//     }
    
    
// }

// hash map

class Solution {
    
    public int lengthOfLongestSubstring(String s) {
       int len = s.length(), res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int j=0, i=0; j<len; j++){
            if(map.get(s.charAt(j))!=null){
                i = Math.max(i, map.get(s.charAt(j)));
            }
            res = Math.max(res, j-i+1);
            map.put(s.charAt(j), j+1);
        }
        
        return res;
    }
    
    
}