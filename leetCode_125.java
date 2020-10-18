class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length()-1;
        int j= len;
        int i =0;
        if(s.length()==0){
            return true;
        }
        while(i<=len){
            if(!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))){
                i++;
                continue;
            }
             else if(!Character.isLetter(s.charAt(j)) && !Character.isDigit(s.charAt(j)) ){
                j--;
                 continue;
            }
            else if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }else{
                i++;
                j--;
            }
        }
        
        return true;
    }
}