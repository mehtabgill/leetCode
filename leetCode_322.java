class Solution {
    //     public int coinChange(int[] coins, int amount) {
    //         if(amount < 0){
    //             return -1;
    //         }
    //         if(amount == 0){
    //             return 0;
    //         }
    //         int min = Integer.MAX_VALUE;
    //         for(int i=0; i< coins.length; i++){
    //             int sol = coinChange(coins, amount - coins[i]);
    //             if(sol >=0 && sol < min){
    //                 min = sol + 1;
    //             }
    //         }
    //         if(min == Integer.MAX_VALUE){
    //             return -1;
    //         }
            
    //         return min;
    //     }
        public int coinChange(int[] coins, int amount) {
           int previous[] = new int[amount+1];
            for(int i=1; i < previous.length ; i++){
                boolean set = false;
                for(int j = 0; j < coins.length ; j++){
                    if(coins[j] <= i){
                        int prev = previous[ i - coins[j]];
                        if(prev != -1 && previous[i] == 0){
                            set = true;
                            previous[i] = prev + 1;
                        }
                        else if(prev != -1 && prev+1 < previous[i]){
                            set = true; 
                            previous[i] = prev+1;
                        }
                    }
                }
                if(!set){
                    previous[i] = -1;
                }
            }
           return previous[amount]; 
        }
        
    }