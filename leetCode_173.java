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
class BSTIterator {
        
    TreeNode rot = new TreeNode();
    List<Integer> list = new ArrayList<>();
    int count = 0 ;
    public BSTIterator(TreeNode root) {
        rot = root;
        inOrder(rot);    
    }
    
    /** @return the next smallest number */
    public int next() {
        int result = list.remove(0);
        count++;
        return result;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return list.size() > 0;
    }
    
    void inOrder(TreeNode root){
        if(root == null) return ;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */