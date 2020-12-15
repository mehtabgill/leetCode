class Solution {
    List<String> result = new ArrayList<>();
    public List<String> letterCasePermutation(String S) {
        backTrack(0, "", S);
        return result;
    }
    
    void backTrack(int start, String current, String s){
        if(start >= s.length()){
            result.add(current);
            return;
        }
        
        if(Character.isLetter(s.charAt(start))){
            String cap = "";
            if(!Character.isUpperCase(s.charAt(start))){
                cap = current.concat(s.substring(start, start+1).toUpperCase());
            }else{
                cap = current.concat(s.substring(start, start+1).toLowerCase());
            }
            
            String small = current.concat(s.substring(start, start+1));
            backTrack(start+1, cap, s);
            backTrack(start+1, small, s);
            
        }else{
            current = current.concat(s.substring(start, start+1));
            backTrack(start+1, current, s);
        }
    }
}      