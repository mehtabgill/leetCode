class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0; i<grid.length;i++){
            for(int j=0; j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    dfs(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }
    
    void dfs(int row, int col, char[][]grid){
        if(row<0 || col <0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0'){
            return;
        }
        grid[row][col]='0';
        dfs(row-1, col, grid);
        dfs(row, col-1, grid);
        dfs(row+1, col, grid);
        dfs(row, col+1, grid);
    }
    
}