


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
    public ListNode deleteDuplicates(ListNode head) {
    
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode dummySon = dummy;
        
        while(head != null && head.next != null){
            
            if(head.val == head.next.val){
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                dummySon.next = head.next;
            }else{
                dummySon = dummySon.next;
            }
            head= head.next;
        }
        return dummy.next;
    }
}