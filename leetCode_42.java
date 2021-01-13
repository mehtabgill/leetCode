class Solution {
    public int trap(int[] height) {
        if(height.length == 0) return 0;
        int[] lef_large = new int[height.length];
        int[] righ_large = new int[height.length];
        
        lef_large[0] = height[0];
        righ_large[height.length-1] = height[height.length-1];
        
        
        for(int i=1; i<height.length; i++){
            lef_large[i] = Math.max(height[i], lef_large[i-1]);      
        }
        
        for(int i=height.length-2; i>=0; i--){
            righ_large[i] = Math.max(righ_large[i+1], height[i]);
        }
        
        int count = 0;
        for(int i = 1; i < height.length-1; i++){
            int water = (Math.min(lef_large[i-1], righ_large[i+1]) - height[i]);
            if(water > 0 )
            count = count + (Math.min(lef_large[i-1], righ_large[i+1]) - height[i]);
        }
        
        
        
        return count;
    }
}