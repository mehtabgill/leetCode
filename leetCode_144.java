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
    Stack<Integer> stack = new Stack<Integer>();
    List<Integer>  list = new ArrayList<>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            for(int i: stack){
                list.add(i);
            }
            stack.clear();
            return list;
        } 
        stack.push(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        return list;
    }
}