class Solution {
    public int countPrimes(int n) {
    
        int count=0;
        boolean[] multipleOfPrime = new boolean[n];
        
        for(int i=2; i< n; i++){
            if(!multipleOfPrime[i]){
                count++;
                for(int j=i+i; j < n; j=j+i){
                    multipleOfPrime[j] = true;
                }
            }
        }
       
        return count;
    }
}