class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer>result = new ArrayList<>();
        // pattern hashmap
        HashMap<Character, Integer> pMap = new HashMap<>();
        
        for(int i = 0; i<p.length(); i++){
            char c = p.charAt(i);
            pMap.put(c, pMap.getOrDefault(c, 0) +1);
        }
        
        HashMap<Character, Integer> currentMap = new HashMap<>();
        int limit = -1;
        for(int i=0; i<=s.length()-p.length(); i++){
            boolean toDo = true;
            for(int j = i+p.length()-1; j>limit; j--){
                char c = s.charAt(j);
                if(!pMap.containsKey(c)){
                   continue;
                }
                currentMap.put(c, currentMap.getOrDefault(c, 0) +1);
            }
            limit = i+p.length()-1;
          
            if(currentMap.equals(pMap)) result.add(i);
            if(currentMap.containsKey(s.charAt(i))){
                int f = currentMap.get(s.charAt(i));
                f--;
                if(f == 0) currentMap.remove(s.charAt(i));
                else{
                    currentMap.put(s.charAt(i), f);    
                }    
            }
            
            
        }
        
        return result;
        
    }
}