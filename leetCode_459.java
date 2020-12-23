class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        
        for(int i=0; i < s.length()/2; i++){
            String cc = s.substring(0, i+1);
            int j = i+1;
            while(j <= s.length()-1 - i){
                String dd = s.substring(j, j+i+1);
                if(!cc.equals(dd)){
                    break;
                }
                j = j + i+ 1;
            }
            if(j >= s.length()) return true;
        }
        
        return false;
            
    }
}