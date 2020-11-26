// class Solution {
//     public int maxProfit(int[] prices) {
//         int res=0;
        
//         for(int i=prices.length-1; i >0 ; i--){
//             for(int j=i-1; j >= 0 ; j--){
//                 if(prices[i] > prices[j]){
//                     int diff = prices[i] - prices[j];
//                     if(diff > res){
//                         res= diff;
//                     }
//                 }
//             }
//         }
        
        
//         return res;
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        if(prices.length==0){
            return 0;
        }
        int min = prices[0];
        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] > min){
                res = Math.max(res, prices[i]-min);
            }else{
                min = prices[i];
            }
        }
        
        
        return res;
    }
}