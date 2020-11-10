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
    TreeNode onS = null; 
     List<Integer> listS = new ArrayList<Integer>();
     List<Integer> listT = new ArrayList<Integer>();
    boolean isSame(TreeNode s, TreeNode t){
         if(s == null && t == null){
             return true;
         }
        if(s==null || t ==null){
             return false;
         }
         if(s.val == t.val){
             return isSame(s.left, t.left) && isSame(s.right, t.right);
         }
        return false;
         
     }
    
     public boolean isSubtree(TreeNode s, TreeNode t) {
             if(s== null || t==null){
                 return false;
             }
            if(isSame(s, t)){
               return true; 
            }
             return isSubtree(s.left, t) || isSubtree(s.right, t);
     }
 }