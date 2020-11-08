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


// class Solution {
//     public TreeNode constructMaximumBinaryTree(int[] nums) {
//        return build(0, nums.length-1, nums);
//     }
    
//     TreeNode build(int s, int e, int[] nums){
//         if(s > e){
//             return null;
//         }
        
//         int maxIndex = s;
//         for(int i=s; i<=e ;i++){
//             if(nums[i] > nums[maxIndex]){
//                 maxIndex = i;
//             }
//         }
        
//         TreeNode root = new TreeNode(nums[maxIndex]);
//         root.left = build(s, maxIndex-1, nums);
//         root.right = build(maxIndex+1, e, nums);
//         return root;
        
//     }
// }


class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       Deque<TreeNode> stack = new LinkedList<TreeNode>();
        for(int i=0; i<nums.length;i++){
            TreeNode current = new TreeNode(nums[i]);
            while(!stack.isEmpty() && nums[i] > stack.peek().val ){
                current.left = stack.pop();
            }
            if(!stack.isEmpty()){
                stack.peek().right = current;
            } 
            stack.push(current);
        }
        return stack.isEmpty() ? null : stack.removeLast();
    }
    
}