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
    List<TreeNode> list = new ArrayList<>();
    void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return build(0, list.size()-1);
    }
    TreeNode build(int s, int e){
        if(s > e){
            return null;
        }else if(s == e){
            return new TreeNode(list.get(s).val);
        }else{
            int mid = (s+e)/2;
            TreeNode newNode = new TreeNode(list.get(mid).val);
            newNode.left = build(s, mid-1);
            newNode.right = build(mid+1, e);
            return newNode;
        }
        
    }
}