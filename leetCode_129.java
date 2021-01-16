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
    List<Integer> cache = new ArrayList<>();
    
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        dfs(root, 0);
        
        int res = 0;
        
        for(int num :  cache){
            res += num;
        }
        return res;
    }
    
    
    void dfs(TreeNode root, int num){
        if(root.left == null && root.right == null){
            int n = num * 10 + root.val;
            cache.add(n);
            return;
        }
        if(root.left != null){
            int n = (num*10 + root.val) ;
            dfs(root.left, n);
        } 
        if(root.right != null) {
             int n =  (num*10 + root.val) ;
            dfs(root.right, n);
        }
    }
}