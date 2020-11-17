/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode match;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        inOrder(cloned, target);
        return match;
    }
    
    void inOrder(final TreeNode node, final TreeNode target){
        if(node == null) return;
        inOrder(node.left, target);
        if(node.val == target.val){
            match = node;
        }
        inOrder(node.right, target);
    }
}