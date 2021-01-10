class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Map<Integer, Integer> m = new TreeMap<>();
        
        for(int[] i: intervals){
            m.put(i[0], m.getOrDefault(i[0], 0) + 1);
            m.put(i[1], m.getOrDefault(i[1], 0) -1);
        }
        
        int res = 0;
        
        int rooms =0;
        for(int v: m.values()){
            rooms += v;
            
            res = Math.max(res, rooms);
        }
        
        
        return res;
    } 
}