class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length() <=1 ) return s.length();
        int res = 1;
        int left=0;
        int[] count = new int[26];
        int maxf = 0;
        for(int right = 0; right < s.length(); right++){
            count[s.charAt(right) - 'A']++;
            maxf = Math.max(maxf, count[s.charAt(right) - 'A']);
            
            if((right-left+1) - (maxf) <= k){
                res = Math.max(res, right-left+1);
            }else{
                count[s.charAt(left)- 'A']--;
                left++;
                
            }
        }
        return res;
    }
}