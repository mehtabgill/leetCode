class Solution {
    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> ll = new LinkedList<>();
        
        for(int i=1; i<= m ; i++){
            ll.add(i);
        }
        
        int[] result = new int[queries.length];
        for(int i=0; i < queries.length ; i++){
            int idx = ll.indexOf(queries[i]);
            int val = ll.get(idx); 
            ll.remove(idx);
            ll.addFirst(val);
            result[i] = idx;
            
        }
        
        return result;
        
        
    }
}