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
    int num_moves = 0;
    public int distributeCoins(TreeNode root) {
        trav(root);
        return num_moves;
    }
    
    int trav(TreeNode root){
        if(root == null){
            return 0;
        }
        int lhs = trav(root.left);
        int rhs = trav(root.right);
        
        num_moves += Math.abs(lhs) + Math.abs(rhs);
        return root.val + lhs + rhs -1;
    }
}