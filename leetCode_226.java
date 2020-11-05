/**
 * Definition for a binary tree node.
 * public class ç {
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
    // dfs
   public TreeNode invertTree(TreeNode root) {
       
       if(root == null){
           return root;
       }
       
       TreeNode left = root.left;
       TreeNode right = root.right;
       
       root.left = invertTree(right);
       root.right = invertTree(left);
       
       return root;
   }
   
}
 

// bfs -  Better coz no size problem

// class Solution {
   
//     public TreeNode invertTree(TreeNode root) {
//         Queue<TreeNode> qu = new LinkedList<TreeNode>();
       
//         if(root != null){
//             qu.add(root);
//         }
       
//         while(!qu.isEmpty()){
//             TreeNode node = qu.poll();
//             TreeNode left = node.left;
//             node.left = node.right;
//             node.right = left;
           
//             if(node.left != null){
//                 qu.add(node.left);
//             }
//             if(node.right != null){
//                 qu.add(node.right);
//             }
//         }
       
//         return root;
//     }
       
// }

