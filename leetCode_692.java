class Solution {
    
    public class Pair{
        String word;
        int freq;
        
        public Pair(String word, int freq){
            this.word = word;
            this.freq = freq;
        }
        
        
    }
    
      class PairComparator implements Comparator<Pair>{ 

        public int compare(Pair p1, Pair p2) { 
           if(p1.freq == p2.freq){
               return p1.word.compareTo(p2.word);
           }
            return p2.freq - p1.freq;
        }

	}
    
    
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String, Integer> freqs = new HashMap<>();
        
        for(String str:words){
            freqs.put(str, freqs.getOrDefault(str, 0)+1);
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new PairComparator());
        
        int count=0;
        
        for(String key: freqs.keySet()){
           pq.offer(new Pair(key, freqs.get(key)));
        }
        
        
        List<String> result = new ArrayList<>();
        
        while(pq.size() > 0 && count < k){
            result.add(pq.poll().word);
            count++;
        }
        
        return result; 
    }
}