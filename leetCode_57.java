class Solution {
    
    public static class Pair implements Comparable<Pair> {
       int st;
       int et;
       
       Pair(int st, int et){
           this.st = st;
           this.et = et;
       }
       
       public int compareTo(Pair other){
           if(this.st != other.st) 
               return this.st - other.st;
           else {
               return this.et - other.et; 
           }
       }
   }
   public int[][] insert(int[][] intervals, int[] newInterval) {
       
       List<Pair> pairs = new ArrayList<>();
       
       
       
       int i=0;
       // end before new interval's start
       while(i < intervals.length && intervals[i][1] < newInterval[0]){
           Pair pp  = new Pair(intervals[i][0], intervals[i][1]);
           pairs.add(pp);
           i++;
       }
       
       // merge with newInterval
       Pair pp = new Pair(newInterval[0], newInterval[1]);
       while(i < intervals.length && intervals[i][0] <= pp.et){
           pp = new Pair(Math.min(pp.st, intervals[i][0]), Math.max(pp.et, intervals[i][1]));
           i++;
       }
       pairs.add(pp);
       
       // add rest of them
       while(i < intervals.length){
           Pair p = new Pair(intervals[i][0], intervals[i][1]);
           pairs.add(p);
           i++;
       }
       
       int[][] result = new int[pairs.size()][2];
       int count = 0;
       while(count < pairs.size()){
           result[count][0] = pairs.get(count).st;
           result[count][1] = pairs.get(count).et;
           count++;
       }
       
       return result;
       
   }
}