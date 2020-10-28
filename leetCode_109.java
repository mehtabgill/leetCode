/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    
    
    
    public TreeNode sortedListToBST(ListNode head) {
     
        if(head == null){
            return null;
        }
        int length =0 ;
        ListNode tt = head;
        while(tt != null){
            length++;
            tt=tt.next;
        }
        int midCount = length/2;
        ListNode midNode = head;
        ListNode prev = head;
        int itr=0;
        while(itr != midCount){
            prev = midNode;
            midNode = midNode.next;
            itr++;
        }
        if(itr == 0){
            head = null;
        }
        prev.next = null;
        ListNode rightSide = midNode.next;
        TreeNode root = new TreeNode(midNode.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(rightSide);
        
        return root; 
        
    }
}