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
    int largest = Integer.MAX_VALUE;
    int total = -1;
    List<Integer> list = new ArrayList<Integer>();
    void inOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left, list);
        // if(list.size() < total){        // if binary tree
        //         list.add(root.val);
        //         Collections.sort(list);
        // }else{
        //     for(int i=0; i<list.size() ; i++){
        //        if(root.val < list.get(i)){
        //             list.set(total-1, root.val);
        //             Collections.sort(list);
        //            break;
        //         }
        //     } 
        // }
        if(list.size() == total){
            return;
        }
        list.add(root.val);
           
        inOrder(root.right, list);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<Integer>();
        total = k;  
        inOrder(root, list);
        return list.get(k-1);
    }
}


//  private static int number = 0;
//   private static int count = 0;

//   public int kthSmallest(TreeNode root, int k) {
//       count = k;
//       helper(root);
//       return number;
//   }
  
//   public void helper(TreeNode n) {
//       if (n.left != null) helper(n.left);
//       count--;
//       if (count == 0) {
//           number = n.val;
//           return;
//       }
//       if (n.right != null) helper(n.right);
//   }
// }