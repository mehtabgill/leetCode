class Solution {
    int count=0;
    public int countArrangement(int N) {
        backtrack(1, N, new boolean[N+1]);
        return count;
    }
    
    
    void backtrack(int pos, int N, boolean[] used){
        if(pos > N){
            count++;
            return;
        }
        for(int i=1; i <= N; i++){
            if(!used[i] && (pos % i == 0 || i%pos == 0)){
                used[i] = true;
                backtrack(pos+1, N, used);
                used[i] = false;
            }
        }
    }
}