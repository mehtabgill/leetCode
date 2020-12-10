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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return builder(0, inorder.length-1, 0, postorder.length-1, inorder, postorder);
    }
    
    TreeNode builder(int in_start, int in_end, int post_start, int post_end, int[] inorder, int[] postorder){
        if(in_start > in_end){
            return null;
        }
        TreeNode root = new TreeNode(postorder[post_end]);
        int left_in_start = in_start;
        int root_in_position = -1;
        for(int i=in_start; i<=in_end; i++){
            if(inorder[i] == root.val){
                root_in_position = i;
            }
        }
        int left_in_end = root_in_position-1;
        int left_post_start = post_start;
        int left_post_end = post_start + (left_in_end - left_in_start);
        int right_in_start = root_in_position+1;
        int right_in_end = in_end;
        int right_post_start = left_post_end + 1;
        int right_post_end = post_end-1;
        
        root.left = builder(left_in_start, left_in_end, left_post_start, left_post_end, inorder, postorder);
        root.right = builder(right_in_start, right_in_end, right_post_start, right_post_end, inorder, postorder);
        return root;
    }
    
}