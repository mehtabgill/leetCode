class Solution {
    public int longestSubstring(String s, int k) {
        
        int[] count = new int[26];
        int res = 0;
        for(int u=1; u <= 26; u++){
            Arrays.fill(count, 0);
            int left = 0, right = 0;
            int numOfUniq = 0, kOrMore = 0;
            
            while(right < s.length()){
                if(numOfUniq <= u){
                     count[s.charAt(right) - 'a']++;
                    if(count[s.charAt(right) - 'a'] == 1){
                        numOfUniq++;
                    }
                    if(count[s.charAt(right) - 'a'] == k){
                        kOrMore++;
                    }
                    right++;
                }
                else{
                    count[s.charAt(left) - 'a']--;
                    if(count[s.charAt(left) - 'a'] == 0) numOfUniq--;
                    if(count[s.charAt(left) - 'a'] == k-1) kOrMore--;
                    left++;
                }
                if(numOfUniq == u && numOfUniq == kOrMore){
                    res = Math.max(res, right - left);
                }
               
            }
        }
        return res;
        
    }
}