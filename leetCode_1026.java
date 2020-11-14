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
/*
class Solution {
    int maxDiff = 0 ;
    public int maxAncestorDiff(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        preOrder(root);
        return maxDiff;
        
    }
    
    void preOrder(TreeNode root){
        List<TreeNode> list = new ArrayList<>();
        getChildren(root, list);
        for(int i=1; i<list.size();i++){
            if(Math.abs((root.val - list.get(i).val)) > maxDiff){
                maxDiff = Math.abs((root.val - list.get(i).val));
            }
        }
        maxAncestorDiff(root.left);
        maxAncestorDiff(root.right);
    }
    
     void getChildren(TreeNode root, List<TreeNode> list){
        if(root == null){
            return ;
        }
         list.add(root);
         getChildren(root.left, list);
         getChildren(root.right, list);
         
    }
}
*/
class Solution {
    int maxDiff = 0 ;
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
        
    }
    
    int dfs(TreeNode root, int max, int min){
        if(root == null){
            return max - min;
        }
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        return Math.max(dfs(root.left, max, min), dfs(root.right, max, min));
    }
}