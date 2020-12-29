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
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        return swap(head);
    }
    
    ListNode swap(ListNode node){
        if(node == null || node.next == null){
            return node;
        }
        
        ListNode head = node.next;
        ListNode rem = node.next.next;
        node.next.next = node;
        node.next = swap(rem);
        
        return head;
    }
}