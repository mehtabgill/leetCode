class Solution {
    public int leastInterval(char[] tasks, int n) {
      
        int[] char_map = new int[26];
        for(char c: tasks){
            char_map[c-'A']++;
        }
        Arrays.sort(char_map);
        
        int max_value = char_map[25] -1;   // -1 because the last occurence of a char does not need any cool time
        int empty_slots = max_value*n;
        
        for(int i = 24; i>= 0; i--){
            empty_slots -= Math.min(max_value, char_map[i]);
            if(empty_slots <= 0){
                break;
            }
        }
        
        return empty_slots > 0 ? tasks.length + empty_slots : tasks.length; 
    }
}