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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        trav(root, val);
        return root;
    }
    
    
    void trav(TreeNode root, int val){
        if(root == null){
            return;
        }
        if(val > root.val){
            if(root.right == null){
                TreeNode n = new TreeNode(val);
                root.right = n;
                return;
            }else{
                trav(root.right, val);
            }
        }
        else if(val < root.val){
            if(root.left == null){
                TreeNode n = new TreeNode(val);
                root.left = n;
                return;
            }else{
                trav(root.left, val);
            }
        }
    }
}