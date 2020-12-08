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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return builder(0, inorder.length-1, 0, preorder.length-1, preorder, inorder);
    }
    
    TreeNode builder(int in_s, int in_e, int pre_s, int pre_e, int[] pre, int[] in){
        if(pre_s > pre_e || in_s > in_e){
             return null;
        }
        TreeNode root = new TreeNode(pre[pre_s]);
        
        int left_in_s = in_s;
        int root_in_index = -1;
        for(int i=in_s; i <= in_e; i++){
            if(in[i] == root.val){
                root_in_index = i;
                break;
            }
        }
        int left_in_e = root_in_index -1;
        int left_pre_s = pre_s + 1;
        int left_pre_e = (left_in_e - left_in_s) + left_pre_s ;
        int right_in_s = root_in_index +1;
        int right_in_e = in_e;
        int right_pre_s = left_pre_e + 1;
        int right_pre_e = pre_e;
        
        root.left = builder(left_in_s, left_in_e, left_pre_s, left_pre_e, pre, in);
        root.right = builder(right_in_s, right_in_e, right_pre_s, right_pre_e, pre, in);
        
        return root;
    }
}