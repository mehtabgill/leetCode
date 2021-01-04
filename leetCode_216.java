// class Solution {
//     List<List<Integer>> result = new ArrayList<>();
    
//     public List<List<Integer>> combinationSum3(int k, int n) {
        
        
        
//         return backtrack(1, k, n);
//     }
    
//      List<List<Integer>> backtrack(int start, int k, int target){
        
//         List<List<Integer>> ll = new ArrayList<>();
        
//         if( k == 2 ){
//             int left= start;
//             int right = 9;
//             while(left < right){
//                 int sum = left + right;
//                 if(sum == target){
//                     List<Integer> temp = new ArrayList<>();
//                     temp.add(left);
//                     temp.add(right);
//                     ll.add(temp);
//                     left++;
//                     right--;
//                 }else if(sum > target) right--;
//                 else left++;
//             }
//             return ll;
//         }
        
//         for(int i=start; i <= 7; i++){
//             if(i > target) continue;
//             List<List<Integer>> temp = backtrack(i+1, k-1, target-i);
//             for(List<Integer> tt: temp){
//                 tt.add(0, i);
//             }
//             ll.addAll(temp);
//         }
//         return ll;
//     }
// }


class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        
        backtrack(1, k, n, new ArrayList<>());
        return result;
    }
    
     void backtrack(int start, int k, int target, List<Integer>list){
        
        if(list.size() == k && target == 0){
            List<Integer> ll= new ArrayList<>(list);
            result.add(ll);
            return ;
        }
         
        for(int i=start; i <= 9; i++){
            if(i > target) continue;
            list.add(i);
            backtrack(i+1, k, target-i, list);
            list.remove(list.size()-1);
        }
    }
}