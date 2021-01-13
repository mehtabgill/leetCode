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
    List<Integer> result = new ArrayList<>();
    int leftd = 0;
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if(root == null) return result;
        result.add(root.val);
        leftBoundary(root.left);
        leaves(root.left);
        leaves(root.right);
        rightBoundary(root.right);
        
        return result;
    }
    
   void leftBoundary(TreeNode root){
       if(root == null || (root.left == null && root.right == null)) return;
       result.add(root.val);
       if(root.left == null) leftBoundary(root.right);
       leftBoundary(root.left);
   }
    
    void rightBoundary(TreeNode root){
        if(root == null || (root.left == null && root.right == null)) return;
       
       if(root.right == null) rightBoundary(root.left);
       rightBoundary(root.right);
        result.add(root.val);
    }
    
    void leaves(TreeNode root){
        if(root == null) return ;
        if(root.left == null && root.right == null){
            result.add(root.val);
            return;
        }
        leaves(root.left);
        leaves(root.right);
    }
}