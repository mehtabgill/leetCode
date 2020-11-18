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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        
        int count=0;
        Stack<TreeNode> stack = new Stack<>();
        if(root != null)
        stack.push(root);
        
        while(!stack.isEmpty()){
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> Tstack = new Stack<>();
            
            while(!stack.isEmpty()){
                TreeNode temp = stack.pop();
                if(count % 2 == 1){
                    if(temp.right != null){
                    Tstack.push(temp.right);
                    }
                    if(temp.left != null){
                    Tstack.push(temp.left);
                    }
                }else{
                    if(temp.left != null){
                        Tstack.push(temp.left);
                    }
                    if(temp.right != null){
                        Tstack.push(temp.right);
                    }
                }
                
                list.add(temp.val);
            }
            stack = Tstack;
            
            res.add(list);
            count++;
            
        }
        return res;
    }
}