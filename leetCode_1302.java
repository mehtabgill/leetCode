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
        if(root == null) return 0;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
    
    void getAtLevel(TreeNode root, int level, List<Integer> list){
        if(root == null) return ; 
        if(level == 1){
            list.add(root.val);
        }
        getAtLevel(root.left, level-1, list);
        getAtLevel(root.right, level-1, list);
    }
    
    public int deepestLeavesSum(TreeNode root) {
        int h = getHeight(root);
        List<Integer> ls = new ArrayList<>();
        getAtLevel(root, h, ls);
        
        int result= 0;
        for(int l: ls){
            result+=l;
        }
        return result;
    }
}