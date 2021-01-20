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
    double minDiff;
    int result;
    public int closestValue(TreeNode root, double target) {
        minDiff = Math.abs(target - (double)root.val);
        result =root.val;
        dfs(root, target);
        return result;
    }
    
    public void dfs(TreeNode root, double target){
        if(root == null) return;
        
        double diff = Math.abs(target - (double)root.val);
        if(diff < minDiff){
            minDiff= diff;
            result = root.val;
        }
        if(root.left != null && target < (double)root.val){
            dfs(root.left, target);
        }
         if(root.right != null && target > (double)root.val){
            dfs(root.right, target);
        }
        
    }
}