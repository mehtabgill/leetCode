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

    int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int lhs = getHeight(root.left);
        int rhs = getHeight(root.right);
        if(lhs >= rhs){
            return lhs +1;
        }else{
            return rhs+1;
        }
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
       if(root == null){
           return root;
       }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(left == right ){
            return root;
        }
        else if(left > right){
            return lcaDeepestLeaves(root.left);
        }
        else{
            return lcaDeepestLeaves(root.right);
        }
    }
}