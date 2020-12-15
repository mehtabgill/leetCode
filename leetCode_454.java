class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        
        HashMap<Integer, Integer> AB = new HashMap<>();
        HashMap<Integer, Integer> CD = new HashMap<>();
        
        for(int i=0; i<A.length;i++){
            for(int j=0; j<B.length; j++){
                int val = A[i] + B[j];
                if(AB.containsKey(val)){
                    int count = AB.get(val);
                    count++;
                    AB.put(val, count);
                }else{
                    AB.put(val, 1);
                }
            }
        }
        int res= 0;
        for(int i=0; i<C.length;i++){
            for(int j=0; j<D.length; j++){
                int val = C[i] + D[j];
                if(AB.containsKey(-1*(val))){
                    res += AB.get(-val);
                }
               
            }
        }
        
        
        return res;
    }
}  