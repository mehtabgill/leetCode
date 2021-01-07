class Solution {
    
    
    public static class Pair implements Comparable<Pair>{
        int num;
        int freq;
        
        public Pair(int num, int freq){
            this.num = num;
            this.freq = freq;
        }
        
         public int compareTo(Pair other){
            return other.freq - this.freq;
        }
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for(int i:nums){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int key: freq.keySet()){
            pq.offer(new Pair(key, freq.get(key)));
        }
        
        int[] res = new int[k];
        
        int count = 0 ;
        
        while(count < k){
            res[count] = pq.poll().num;
            count++;
        }
        
       
        return res;   
    }
}