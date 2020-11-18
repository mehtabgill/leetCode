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
    public void flatten(TreeNode root) {
        if(root == null) return;
        
        flatten(root.left);
        if(root.left != null){
            TreeNode temp = root.right;
            root.right = root.left;
            
            TreeNode t = root.left;
            while(t.right != null){
                t = t.right;
            }
            t.right = temp ;
            root.left = null;
            
        }
        flatten(root.right);
    }
}