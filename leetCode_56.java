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
    public int[][] merge(int[][] intervals) {
        Pair pairs[] = new Pair[intervals.length];
        
        for(int i=0 ; i < intervals.length; i++){
            pairs[i] = new Pair(intervals[i][0], intervals[i][1]);
        }
        
        Arrays.sort(pairs);
        
        Stack<Pair> stack = new Stack<>();
        stack.push(pairs[0]);
        
        for(int i=1; i<pairs.length; i++){
            if(pairs[i].st >= stack.peek().st && pairs[i].st <= stack.peek().et){
                stack.peek().et = stack.peek().et > pairs[i].et ? stack.peek().et : pairs[i].et ;
            }    else{
                stack.push(pairs[i]);
            }
        }
        
        int res[][] = new int[stack.size()][2];
        int count=0;
        while(!stack.isEmpty()){
            Pair p = stack.pop();
            res[count][0] = p.st;
            res[count][1] = p.et;
            count++;
        }
        
        return res;
    }
}