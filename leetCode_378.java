class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int realk  = matrix.length*matrix[0].length - k +1;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(realk);
        
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j < matrix[0].length; j++){
                if(count < realk){
                    count++;
                    pq.offer(matrix[i][j]);
                }else{
                    pq.remove();
                    pq.offer(matrix[i][j]);
                }
            }
        }
        
//         int res = 0;
        
//         while(pq.size() > 0){
//             res = pq.remove();
//         }
        return pq.remove();
    }
}