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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null) return head;
        int left=1;
        ListNode start = new ListNode(0);
        start.next = head;
        while(left < m){
            start = start.next;
            left++;
        }
        int right = left;
        ListNode end = start.next;
        while(right < n){
            end = end.next;
            right++;
        }
        
        ListNode rem = end.next;
        end.next = null;
        
        start.next = reverse(start.next);
        ListNode t = start.next;
        while(start.next != null){
            start= start.next;
        
        }
        
        start.next = rem;
        if(m == 1) return t;
        return head;
    }
    
    
    ListNode reverse(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}