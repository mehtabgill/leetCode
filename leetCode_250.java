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

        int res = 0;
        
        public int countUnivalSubtrees(TreeNode root) {
    
            caller(root);
            
            return res;
        }
        
        public void caller(TreeNode root){
            
            if(root  == null ) return;
            
            
            if(travis(root, root.val)) res++;
            caller(root.left);
            caller(root.right);
        }
        
        public boolean travis(TreeNode root, int val){
            if(root == null) return true;
            if(root.val != val) return false;
            return travis(root.left, val) && travis(root.right, val);
            
        }
        
    }