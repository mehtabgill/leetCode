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
    public int longestConsecutive(TreeNode root) {
        if(root == null) return 0;
        travis(root, 1);
        return result;
    }
    
    void travis(TreeNode root, int val){
        if(root == null){
            return;
        }
        result = Math.max(val, result);
        
       if(root.left != null ){
           if(root.val == (root.left.val - 1))
           travis(root.left, val+1);
           else travis(root.left, 1);
       }
        if(root.right != null ){
           if(root.val == (root.right.val - 1))
           travis(root.right, val+1);
           else travis(root.right, 1);
       }
        
    }
}