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
    TreeNode result = null;
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        dfs(root, val);
        return result;
    }
    
    private void dfs(TreeNode root, int val){
        if(root == null) return;
        
        if(root.val == val){
            result = root;
            return;
        }
        if(root.left != null && val < root.val){
            dfs(root.left, val);
        }
        
        if(root.right != null && val > root.val){
            dfs(root.right, val);
        }
    }
}