class CombinationIterator {
    List<String> result;
    String str;
    int k;
    int itr;
    public CombinationIterator(String characters, int combinationLength) {
        str = characters;
        k = combinationLength;
        itr=0;
        result = new ArrayList<>();
        backTrack("", str, k);
    }
    
    public String next() {
        return result.get(itr++);
    }
    
    public boolean hasNext() {
        return itr < result.size();
    }
    
    void backTrack(String current, String s, int k){
        if(current.length() == k){
            result.add(current);
            return;
        }
        
        for(int i=0; i<s.length(); i++){
            current = current.concat(s.substring(i, i+1));
            String ss = s.substring(i+1);
            backTrack(current, ss, k);
            current = current.substring(0, current.length()-1);
            
        }
    }
    
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */