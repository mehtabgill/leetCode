class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> dp = new ArrayList<>(triangle.get(triangle.size()-1));
        int res = Integer.MAX_VALUE;
        for(int i=triangle.size()-2; i>=0 ; i--){
            for(int j=0; j < triangle.get(i).size(); j++){
                dp.set(j, triangle.get(i).get(j) + Math.min(dp.get(j), dp.get(j+1))); 
                if(dp.get(j) < res){
                    res = dp.get(j);
                }
            }
            
        }
        
        return dp.get(0);
    }
}