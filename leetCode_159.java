class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Set<Character> set = new HashSet<>();
       
        Map<Character, Integer> map = new HashMap<>();
        
        
       int left = 0 , res =0 ;
        
        for(int right=0; right<s.length(); right++){
            map.put(s.charAt(right), right);
            set.add(s.charAt(right));
            while(set.size() > 2){
                
                char r = '9';
                int ii = s.length();
                for(char c: set){
                    if(map.get(c) < ii){
                        r = c;
                        ii= map.get(c);
                    }
                }
                set.remove(r);
                left= ii+1;
            }
            
            res = Math.max(res, right - left+1);
        }
        
        return res ;
    }
}