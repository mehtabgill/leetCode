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
//     List<Integer> list = new ArrayList<>();
    
//     void inorder(TreeNode root){
//         if(root == null){
//             return;
//         }
//         inorder(root.left);
//         list.add(root.val);
        
//         inorder(root.right);
//     }
    
//     public List<Integer> inorderTraversal(TreeNode root) {
//         inorder(root);
//         return list;
//     }
// }

//   Stack
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            
            cur = stack.pop();
            list.add(cur.val);
            
            cur = cur.right;
        }
        return list;
    }
}