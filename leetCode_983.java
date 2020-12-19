class Solution {
    
    public int mincostTickets(int[] days, int[] costs) {
       boolean[] isTravelDay = new boolean[366];
       for(int i: days){
           isTravelDay[i] = true;
       }
        int lastDay = days[days.length - 1];
        
        int[] minCost = new int[lastDay+1];
        
        for(int i=1; i<=lastDay; i++){
            if(!isTravelDay[i]){
                minCost[i] = minCost[i-1];
            }else{
                int one = minCost[i-1] + costs[0];
                int seven = minCost[Math.max(0, i-7)] + costs[1];
                int thirty = minCost[Math.max(0, i-30)] + costs[2];
                int min = Math.min(one, Math.min(seven, thirty));
                minCost[i] = min;
            
            }
        }
        
        return minCost[lastDay];
    }
}