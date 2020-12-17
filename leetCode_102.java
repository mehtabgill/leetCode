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
    List<List<Integer>> result =  new ArrayList<>();
   
    
    
   public int height(TreeNode node){
        if(node == null) return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
    }
    
   public void Level(TreeNode node, int level, List<Integer> list){
        if(node == null) return ;
            
        if(level == 1){
            list.add(node.val);
            return;
        }
        Level(node.left, level-1, list);
        Level(node.right, level-1, list);
    }
     public List<List<Integer>> levelOrder(TreeNode root) {
        
        int h = height(root);
        for(int i = 1; i <= h; i++){
            List<Integer> ll = new ArrayList<>();
            Level(root, i, ll);
            result.add(ll);
        }
        return result;
    }
}