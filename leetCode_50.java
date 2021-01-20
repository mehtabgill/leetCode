class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1.0;
        
        long N = n;
        
        if(N < 0){
            N *= -1;
            x = 1/x;
        }
        double ans = 1;
        double currentProd = x;
        
        while(N > 0){
            if(N % 2 == 1){
                ans = ans*currentProd;
            }
            currentProd *= currentProd;
            N = N/2;
        }
        
        return ans;
        
    }
}