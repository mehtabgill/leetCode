class Solution {
    public int partitionDisjoint(int[] A) {
        
        int res =  0;
        
        int max= A[0], earlier_max= A[0];
        
        for(int i=1; i < A.length; i++){
            max = Math.max(max, A[i]);
            
            if(A[i] < earlier_max){
                earlier_max = max;
                res = i;
            }
        }
        
        return res+1;
    }
}