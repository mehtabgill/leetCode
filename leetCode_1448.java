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
    int count = 0;
    
    public int goodNodes(TreeNode root) {
        if(root == null){
            return count;
        }    
        count = 1;
        
        trav(root);
        return count;
    }
    
    void trav(TreeNode root){
        if(root == null){
            return ;
        }
        if(root.left != null){
            if(root.val <= root.left.val){
                count++;
            }
            else{
                root.left.val = root.val;
            }
        }
       if(root.right != null){
            if(root.val <= root.right.val){
                count++;
            }
            else{
                root.right.val = root.val;
            }
        }
          trav(root.left);
          trav(root.right);
    }
}