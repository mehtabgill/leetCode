// class Solution {
//     int result = 0;
//     public int numTeams(int[] rating) {
//         backTrack(new ArrayList<Integer>(), 0, rating);
//         return result;
//     }
    
//     void backTrack(List<Integer> ll, int start, int[] rating){
//         if(ll.size() == 3){
//             if( ((ll.get(0) > ll.get(1)) && (ll.get(1)> ll.get(2))) || ((ll.get(2) > ll.get(1)) && (ll.get(1)> ll.get(0)))   ){
//                 result++;
//             }
//             return ;
//         }
        
        
//         for(int i=start; i<rating.length;i++){
//             ll.add(rating[i]);
//             backTrack(ll, i+1, rating);
//             ll.remove(ll.size()-1);
//         }
//     }
// }

class Solution {
    
    public int numTeams(int[] rating) {
        
        int left_s=0, right_s=0, left_b=0, right_b=0, result=0;
        for(int i=0; i < rating.length; i++){
            for(int j=0; j <i; j++){
                if(rating[j] > rating[i]) left_b++;
                if(rating[j] < rating[i]) left_s++;
            }
            for(int k=i+1; k < rating.length; k++){
                if(rating[k] > rating[i]) right_b++;
                if(rating[k] < rating[i]) right_s++;
            }
            
            result += left_s*right_b + left_b*right_s;
            left_s=0;left_b=0;right_s=0;right_b=0;
        }
        return result;
    }
}