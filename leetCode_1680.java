class Solution {
    public int concatenatedBinary(int n) {
        if(n==0) return 0;
        long res = 1;
        String fi = "";
        int MOD = 1_000_000_007;
        
        for(int i=2; i<=n ; i++){
            res = res << Integer.toBinaryString(i).length();
            res = (res + i)% MOD;
        }
        
        return (int)res;
    }
}