class Solution {
    public int minSwaps(int[] data) {
        
        
        int[] num_of_ones= new int[data.length];
        
        num_of_ones[0] = data[0];
        int total_ones = data[0] == 1 ? 1 : 0;
        for(int i=1; i < data.length; i++){
            num_of_ones[i] = num_of_ones[i-1];
            if(data[i] == 1){
                num_of_ones[i]++;
                total_ones++;
            }
        }
        
        if(total_ones == 0) return 0;
        int max_ones = num_of_ones[total_ones-1];
        
        for(int i=total_ones ; i < data.length; i++){
            int ones_till_here = num_of_ones[i] - num_of_ones[i - total_ones] ;
            max_ones = Math.max(max_ones, ones_till_here);
        }
        
        
        return total_ones - max_ones;
        
    }
}