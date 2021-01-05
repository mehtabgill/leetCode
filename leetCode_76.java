class Solution {
    public String minWindow(String s, String t) {
        
        String res = "";
        
        int len = Integer.MAX_VALUE;
        
        HashMap<Character, Integer> t_freq = new HashMap<>();
        
        int t_count = 0;
        for(int i=0; i < t.length(); i++){
            t_freq.put(t.charAt(i), t_freq.getOrDefault(t.charAt(i), 0)+1);
        }
        
        int left =0;
        
        int t_count_c = t_count;
        for(int right=0; right< s.length(); right++){
            if(t_freq.containsKey(s.charAt(right))){
                t_freq.put(s.charAt(right), t_freq.get(s.charAt(right))-1);
                if(t_freq.get(s.charAt(right)) >= 0){
                    t_count++;
                } 
            }
            while(t_count == t.length()){
                if(len > right-left+1){
                    len = right-left+1;
                    res=s.substring(left, right+1);
                }
                if(t_freq.containsKey(s.charAt(left))){
                    t_freq.put(s.charAt(left), t_freq.get(s.charAt(left))+1);
                    if(t_freq.get(s.charAt(left))>0){
                        t_count--;
                    }
                }
                 left++;
            }
        }
        
        return res;
    }
}