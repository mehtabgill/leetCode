class Solution {
    class Pair {
        int x;
        int y;
        
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    class PairComparator implements Comparator<Pair>{ 
			
			// Overriding compare()method of Comparator 
						// for descending order of cgpa 
			public int compare(Pair p1, Pair p2) { 
				int d1 = (p1.y*p1.y)+(p1.x*p1.x);
                int d2 = (p2.y*p2.y)+(p2.x*p2.x);
                
                return d2 - d1;
            }

		}
    public int[][] kClosest(int[][] points, int K) {
         PriorityQueue<Pair> pq = new PriorityQueue<Pair>(K, new PairComparator()); 
        
        int count = 0;
        for(int i=0;i<points.length;i++){
            if(count < K){
                count++;
                pq.offer(new Pair(points[i][0], points[i][1]));
            }else{
                
                if( new PairComparator().compare(new Pair(points[i][0], points[i][1]), pq.peek()) > 0){
                    pq.remove();
                    pq.offer(new Pair(points[i][0], points[i][1]));
                }
                
            }
        }
        
        int[][] result = new int[pq.size()][2];
        
        int cc = 0;
        
        while(pq.size() > 0){
            Pair p = pq.remove();
            result[cc][0] = p.x; 
            result[cc][1] = p.y;
            cc++;
        }
        
        return result;
    }
}