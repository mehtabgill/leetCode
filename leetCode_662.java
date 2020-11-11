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
    int finalWidth;
    HashMap<Integer, Integer> map;
    
    public int widthOfBinaryTree(TreeNode root) {
        finalWidth = 0 ;
        map = new HashMap();
         helper(root, 0, 1);
        return finalWidth;
    }
    
    void helper(TreeNode root, int depth, int pos){
        if(root == null){
            return ;
        }
        map.computeIfAbsent(depth, x-> pos);
        finalWidth = Math.max(finalWidth, pos - map.get(depth) + 1);
        helper(root.left, depth+1, pos*2);
        helper(root.right, depth+1, pos*2 +1);
    }
}