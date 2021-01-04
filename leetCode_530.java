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
// class Solution {
//     int result= Integer.MAX_VALUE;
//     public int getMinimumDifference(TreeNode root) {
//         preOrder(root);
//         return result;
//     }
    
//     void preOrder(TreeNode root){
//         if(root == null) return ;
        
//         if(root.left != null){
//             int num = biggest(root.left).val;
//             if( root.val - num < result) result= root.val - num;
//         }
//         if(root.right != null){
//             int num = smallest(root.right).val;
//             if(num - root.val < result) result= num - root.val;
//         }
//         preOrder(root.left);
//         preOrder(root.right);
//     }
    
//     TreeNode smallest(TreeNode root){
//         if(root.left == null){
//             return root;
//         }
//         return smallest(root.left);
//     }
//     TreeNode biggest(TreeNode root){
//         if(root.right == null){
//             return root;
//         }
//         return biggest(root.right);
//     }
// }



class Solution {
    int result= Integer.MAX_VALUE;
    TreeNode prev; 
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return result;
    }
    
    void inOrder(TreeNode root){
        if(root == null) return ;
        
        inOrder(root.left);
        if(prev != null) result = Math.min(result, root.val-prev.val);
        prev = root;
        inOrder(root.right);
    }
}