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
    
    int max= 0; 
    
    int deepEnd(TreeNode node){
        if(node == null){
            return 0;
        }    
        int lhs = deepEnd(node.left);
        int rhs = deepEnd(node.right);
        max = Math.max(max, lhs+rhs);
        if(lhs >= rhs){
            return lhs+1;
        }else {
            return rhs+1;
        }
    }
    
    
    public int diameterOfBinaryTree(TreeNode root) {
       deepEnd(root);
        return max;
        
    }
}