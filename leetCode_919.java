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
class CBTInserter {
    
    TreeNode rot = new TreeNode(); 
    public CBTInserter(TreeNode root) {
        rot.val = root.val;
        rot.left = root.left;
        rot.right = root.right;
    }
    
    public int insert(int v) {
        Queue<TreeNode> q = new LinkedList<>();
        
        int result = rot.val;
        q.add(rot);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp.left == null){
                temp.left = new TreeNode(v);
                result = temp.val;
                break;
            }
            else if(temp.right == null){
                 temp.right = new TreeNode(v);
                result =  temp.val;
                break;
            }
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
        return result;
    }
    
    public TreeNode get_root() {
        return rot;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */