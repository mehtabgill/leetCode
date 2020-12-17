class Solution {
    public int getMaximumGold(int[][] grid) {
        int res = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                int sum = pathSum(i, j, 0, grid);
                if(sum > res){
                    res= sum;
                }
            }
        }
        return res; 
    }
    
    int pathSum(int row, int col, int currentSum, int[][] grid){
        if(row<0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0) 
            return currentSum;
        
        int safe = grid[row][col];
        currentSum += safe;
        
        grid[row][col] = 0;
        
        // up and left box
        int leftUpper = Math.max(pathSum(row-1, col, currentSum, grid), pathSum(row, col-1, currentSum, grid));
        int rightLower = Math.max(pathSum(row+1, col, currentSum, grid), pathSum(row, col+1, currentSum, grid));
        
        int max = Math.max(leftUpper, rightLower);
        
        grid[row][col] = safe;
        
        return max;
    }
}