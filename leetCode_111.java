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
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        
       dfs(root, 1);
        
        return min;
        
    }
    
    public void dfs(TreeNode root, int prev){
        if(root.left == null && root.right == null){
            min = Math.min(min, prev);
            return;
        }
        if(root.left!= null) dfs(root.left, prev+1);
        if(root.right != null) dfs(root.right, prev+1);
    }
}