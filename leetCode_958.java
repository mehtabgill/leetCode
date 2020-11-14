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
    int getH(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(getH(root.left), getH(root.right));
    }
    void atLevel(TreeNode root, int level, List<TreeNode> list){
        if(root == null){
            return ;
        }
        if(level == 1){
            list.add(root);
            return;
        }
        atLevel(root.left, level-1, list);
        atLevel(root.right, level-1, list);
    }
    
    public boolean isCompleteTree(TreeNode root) {
        int height = getH(root);
        for(int i = 1; i<height;i++){
            List<TreeNode> ls = new ArrayList<>();
            atLevel(root, i, ls);
            if((int)Math.pow(2, i-1) != ls.size()){
                return false; 
            }
        }    
        List<TreeNode> ls = new ArrayList<>();
        atLevel(root, height-1, ls);
        List<TreeNode> last = new ArrayList<>();
        atLevel(root, height, last);
        int count = last.size();
        int start = 0;
        for(int i=0; i < ls.size(); i++){
            if(start > count -1){
                break;
            }
            if(ls.get(i).left != last.get(start)){
                return false;
            }
            start++;
            if(start <= count -1){
                if(ls.get(i).right != last.get(start)){
                    return false;
                }
            }
            start++;
        }
        return true;
        
    }
}