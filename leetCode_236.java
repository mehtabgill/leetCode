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
    List<TreeNode> getPath(TreeNode root, TreeNode p, List<TreeNode> list){
        if(root == null){
            return list;
        }
        if(root.val == p.val){
            list.add(root);
            return list;
        }
        else if(getPath(root.left, p, list).size()>=1 || (getPath(root.right, p, list).size()>=1)  ){
            list.add(root);
            return list;
        }else{
            return list;
        }
        
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return root;
        }
        List<TreeNode> pathP = getPath(root, p, new ArrayList<TreeNode>());
        List<TreeNode> pathQ = getPath(root, q, new ArrayList<TreeNode>());
        
        while(pathP.get(0).val != pathQ.get(0).val){
            if(pathP.size()> pathQ.size()){
                pathP.remove(0);
            }else if(pathQ.size()> pathP.size()){
                pathQ.remove(0);
            }else{
                pathP.remove(0);
                pathQ.remove(0);
            }
        }
       
        return pathP.get(0); 
    }
}