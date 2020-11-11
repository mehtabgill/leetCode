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
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> res = new LinkedList<>();
        int height = getHeight(root);
        int rows  = height;
        int cols = (int)Math.pow(2, height)-1;
        
        for(int i=0; i <rows ; i++){
            List<String> r = new ArrayList<>();
            for(int j=0;j<cols;j++){
                r.add("");
            }
            res.add(r);
        }
        populate(root, res, 0, height, 0, cols);
        return res;
    }
    
    void populate(TreeNode root, List<List<String>> res, int row, int totRows, int s, int e){
        if(row == totRows || root == null){
            return;
        }
        res.get(row).set((s+e)/2, Integer.toString(root.val));
        populate(root.left, res, row+1, totRows, s, (s+e)/2);
        populate(root.right, res, row+1, totRows, (s+e)/2 + 1, e);
    }
    
    int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right)) ;
    }
}