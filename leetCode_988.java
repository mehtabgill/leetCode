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
    String answer = "";
    public String smallestFromLeaf(TreeNode root) {
        
        return travis(root, "");
    }
    
    String travis(TreeNode root, String suffix){
        if(root == null) return suffix;
        
        
        String ss = "" + (char)('a' + root.val) + suffix;
        
        String left = travis(root.left, ss);
        String right = travis(root.right, ss);
        
        if(left.equals(ss)) return right;
        else if(right.equals(ss)) return left;
        
        return left.compareTo(right) <= 0 ? left : right;
            
        
        
    }
}