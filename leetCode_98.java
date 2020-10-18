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
    int getMax(TreeNode root){
    while(root.right!= null){
        root = root.right;
    }
    return root.val;
}

int getMin(TreeNode root){
    while(root.left!= null){
        root = root.left;
    }
    return root.val;
}
    
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        
        if((root.left ==null || root.val > getMax(root.left)) && (root.right ==null || getMin(root.right)> root.val)){
            return isValidBST( root.left) && isValidBST( root.right) ;
        }
        else{
            return false;
        }
    }
}