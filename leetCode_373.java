class Solution {
    
    public class Pair{
        int x;
        int y;
        int indx;  // nums 2 partner index
        
        public Pair(int x, int y, int indx){
            this.x = x;
            this.y = y;
            this.indx = indx;
        }
    }
    
   class PairComparator implements Comparator<Pair>{ 

        public int compare(Pair p1, Pair p2) { 
            int d1 = p1.x + p1.y;
            int d2 = p2.x + p2.y;
            return d1 - d2;
        }

	}
    
    
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if(nums1.length == 0 || nums2.length == 0 || k == 0) return new ArrayList<>();
        
        List<List<Integer>> result = new ArrayList<>();
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(new PairComparator());
        
        for(int i=0;i<nums1.length;i++){
            pq.offer(new Pair(nums1[i], nums2[0], 0));
        }
        int count=0;
        while(count < k && !pq.isEmpty()){
            count++;
            Pair pair = pq.poll();
            result.add(Arrays.asList(pair.x, pair.y));
            if(pair.indx == nums2.length-1) continue;
            pq.offer(new Pair(pair.x, nums2[pair.indx+1], pair.indx+1));
            
        }
        return result;
    }
}