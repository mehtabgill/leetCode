
// Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

// Note: A leaf is a node with no children.


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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        if(root.left==null && root.right==null){
            if(sum == root.val){
                return true;
            }else{
                return false;
            }
        }
        boolean result = hasPathSum(root.left, sum - root.val);
        if(result){
            return result;
        }else{
            result =  hasPathSum(root.right, sum - root.val);
        }
        
        return result;
    }
}