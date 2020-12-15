class Solution {
    List<List<String>> result = new ArrayList<>(); 
    
    public List<List<String>> partition(String s) {
        List<String> ll = new ArrayList<>();
        backTrack(0, ll, s);
        return result;
    }
    
    void backTrack(int pos, List<String> list, String s){
        if( pos == s.length() ){
            List<String> ll = new ArrayList<>(list);
            result.add(ll);
            return;
        }
        
        int len = s.length();
        for(int i=pos ; i<len ; i++){
            if(isPal(s.substring(pos, i+1))){
                list.add(s.substring(pos, i+1));
                backTrack(i+1, list, s);
                list.remove(list.size()-1);
            }
        }
    }
    
    boolean isPal(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }
}