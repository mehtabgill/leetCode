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
    int total = 0;
    public int sumEvenGrandparent(TreeNode root) {
        preOrder(root);
        return total;
    }
    
    void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        if(root.val % 2 == 0){
            if(root.left != null){
                int left = (root.left.left != null ? root.left.left.val : 0);
                int right = (root.left.right != null ? root.left.right.val : 0);
                total = total + left+ right;
            }
             if(root.right != null){
                int left = (root.right.left != null ? root.right.left.val : 0);
                int right = (root.right.right != null ? root.right.right.val : 0);
                total = total + left + right;
            }
        }
        preOrder(root.left);
        preOrder(root.right);
    }
}