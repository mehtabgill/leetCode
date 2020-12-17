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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverse(head);
        if(n == 1){
            head = head.next;
            if(head == null) return head;
            return reverse(head);
        }
        int k = 1;
        ListNode temp = head;
        while(k < n){
            if(k == n-1){
                temp.next = temp.next.next;
                break;
            }
            k++;
            temp = temp.next;
        }
        
        return reverse(head);
    }
    
    ListNode reverse(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode hh = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return hh; 
    }
}