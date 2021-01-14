/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
   public static class Pair implements Comparable<Pair> {
        int val;
        int y;
        int x;
        
        Pair(int st, int et, int x){
            this.val = st;
            this.y = et;
            this.x = x;
        }
        
        public int compareTo(Pair other){
            if(this.y == other.y){
                return this.val - other.val;
            }
            return this.y - other.y;
        }
    } 
    
    
    Map<Integer, PriorityQueue<Pair>> map = new TreeMap<>();
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        
        travis(root, 1, 0);
        
        for(int key: map.keySet()){
            PriorityQueue<Pair> q = map.get(key);
            List<Integer> ll = new ArrayList<>();
            
            while(!q.isEmpty()){
                ll.add(q.poll().val);
            }
            result.add(ll);
        }
        return result;        
    }
    
    
    public void travis(TreeNode root, int x, int y){
        if(root == null) return;
        
        
        travis(root.left, x-1, y+1);
        
        PriorityQueue<Pair> q = map.getOrDefault(x, new PriorityQueue<Pair>());
        q.offer(new Pair(root.val, y, x));
        map.put(x, q);
        
        
        travis(root.right, x+1, y+1);
    }
}