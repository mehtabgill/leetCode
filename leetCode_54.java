class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        int minr = 0, minc =0;
        int maxr = matrix.length-1, maxc = matrix[0].length-1;
        
        int boxesLeft = matrix.length*(matrix[0].length);
        
        while(boxesLeft > 0){
            //top wall
            for(int i=minc; i<=maxc && boxesLeft > 0;i++){
                list.add(matrix[minr][i]);
                boxesLeft--;
            }
            minr++;
            //right wall
            for(int i=minr;i<= maxr && boxesLeft > 0;i++){
                list.add(matrix[i][maxc]);
                boxesLeft--;
            }
            maxc--;
            //bottom wall
            for(int i=maxc; i >= minc && boxesLeft > 0; i--){
                list.add(matrix[maxr][i]);
                boxesLeft--;
            }
            maxr--;
            //left wall
            for(int i=maxr; i >=minr && boxesLeft > 0 ;i--){
                list.add(matrix[i][minc]);
                boxesLeft--;
            }
            minc++;
            //update boundary
            
        }
        return list;
    }
}