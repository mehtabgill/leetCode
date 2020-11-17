// class Solution {
//     List<TreeNode> list = new ArrayList<TreeNode>();
//     public List<Integer> pathInZigZagTree(int label) {
//         int height = (int)(Math.log(label)/Math.log(2)) + 1;
//         List<Integer> list = new ArrayList<Integer>();
//         list.add(label);
//         int parentIndex = getParentIndex(height, label);
//         for(int i = height-1; i>= 1; i--){
//             List<Integer> nodes = getNodesAtLevel(i);
//             int toAdd = nodes.get(parentIndex);
//             parentIndex = getParentIndex(i, toAdd);
//             list.add(toAdd);
//         }
//         Collections.reverse(list);
//         return list;
//     }
    
//     List<Integer> getNodesAtLevel(int height){
//         int min = (int)Math.pow(2, height -1);
//         int max = (int)Math.pow(2, height) - 1;
//         List<Integer> list = new ArrayList<Integer>();
//         if(height % 2 == 0){
//             for(int i=max; i>=min; i--){
//                 list.add(i);
//             }
//         }else{
//             for(int i=min; i<=max; i++){
//                 list.add(i);
//             }
//         }
//         return list;
//     }
    
//     int getParentIndex(int height, int val){
//         int min = (int)Math.pow(2, height -1);
//         int max = (int)Math.pow(2, height) - 1;
//         int start = -1;
//         if(height % 2 == 0){
//             start = max;
//         }else{
//             start = min ;
//         }
        
//         int diff = (int)Math.abs((start-val));
        
//         return diff/2;
//     }
// }




class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(label);
        int parent = label;
        
        while(parent != 1){
            int h = (int)(Math.log(parent)/Math.log(2)) +1;
            int offset  = (int)Math.pow(2, h) - 1 - parent;
            parent  = ((int)Math.pow(2, h-1) + offset)/2;
            list.addFirst(parent);
        }
        return list;
    }
    
}