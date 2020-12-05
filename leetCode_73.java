class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> cols = new HashSet<>();
        
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    cols.add(j);
                    for(int c=0; c<matrix[0].length;c++){
                        if(matrix[i][c] == 0){
                            cols.add(c);
                        }else{
                            matrix[i][c] = 0;
                        }
                    }
                    break;
                }
            }
        }
        
        for(int col: cols){
            for(int i=0; i<matrix.length;i++){
                matrix[i][col] = 0;
            }
        }
    }
}