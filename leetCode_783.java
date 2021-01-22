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
    int res = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return res;
    }
    
    
    int getMax(TreeNode root){
        
        while(root.right != null){
            root = root.right;
        }
        
        return root.val;
    }
    
    int getMin(TreeNode root){
         while(root.left != null){
             root= root.left;
         }
        return root.val;
    }
    
    
    void dfs(TreeNode root){
        if(root == null) return;
        
        if(root.left != null){
            int diff = Math.abs(root.val - getMax(root.left));
            res = Math.min(res, diff);
        }
        if(root.right != null){
            int diff = Math.abs(getMin(root.right)-root.val);
            res = Math.min(res, diff);
        }
        
        dfs(root.left);
        dfs(root.right);
    }
}