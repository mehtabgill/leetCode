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
    
    int result = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
        getPath(root, root.val);
        
        return result;
    } 
    
    public int getPath(TreeNode root, int val){
        if(root == null) return 0;
        
        int left = getPath(root.left, root.val);
        int right = getPath(root.right, root.val);
        
        result = Math.max(result, left+right);
        
        if(root.val == val) return Math.max(left, right) + 1;
        return 0;
    }
    
    
}