class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Map<Integer, Integer> map = new TreeMap<>();
        
        for(int[] t: trips){
            map.put(t[1], map.getOrDefault(t[1], 0) + t[0]);
            map.put(t[2], map.getOrDefault(t[2], 0) - t[0]);
        }
        
        for(int i: map.values()){
            capacity -= i;
            if(capacity < 0) return false;
        }
        
        return true;
    }
}