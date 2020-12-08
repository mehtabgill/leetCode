class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if((board[i][j] == word.charAt(0)) && dfs(i, j, 0, word, board)) 
                    return true;
            }
        }
        return false;
    }
    
    boolean dfs(int i, int j, int count, String word, char[][] board){
        if(count == word.length())
            return true;
        
        if(i >= board.length || j >= board[0].length || i < 0 || j < 0 || board[i][j] != word.charAt(count)) 
            return false;
       char temp = board[i][j];
        board[i][j] = '*';
        boolean found = dfs(i+1, j, count+1, word, board) ||
                        dfs(i-1, j, count+1, word, board) ||
                        dfs(i, j+1, count+1, word, board) ||
                        dfs(i, j-1, count+1, word, board);
        
        // put box back to its orignal char
        board[i][j]  = temp;
        return found;
        
    }
}