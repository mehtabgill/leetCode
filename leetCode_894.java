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
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> res = new ArrayList<>();
        if(N == 1){
            res.add(new TreeNode(0));
            return res;
        }
        N = N-1;
        for(int i = 1; i < N ; i +=2){
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(N-i);
            for(TreeNode l: left){
                for(TreeNode r: right){
                    TreeNode cur = new TreeNode(0);
                    cur.left = l;
                    cur.right = r;
                    res.add(cur);
                }
            }
            
        }
        return res;
    }
}