class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        
        int[] freqS1 = new int[26];
        
        int[] windowF = new int[26];
        
        for(int i=0; i < s1.length(); i++){
            freqS1[s1.charAt(i) - 'a']++;
            windowF[s2.charAt(i) - 'a']++;
        }
        
        
        
        int left =0, right = s1.length()-1;
        while(right < s2.length() ){
            if(Arrays.equals(windowF, freqS1)) return true;
            windowF[s2.charAt(left)- 'a']--;
            left++;
            right++;
            if(right < s2.length() )
            windowF[s2.charAt(right)- 'a']++;
        }
        
        return false;
    }
}