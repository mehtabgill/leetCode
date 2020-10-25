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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode current  = head, future = head;
        
        while(future != null && future.next != null ){
            prev = current;
            current = current.next;
            future = future.next.next;
        }
        prev.next = null;
        ListNode lhs = sortList(head);
        ListNode rhs = sortList(current);
        
        return merge(lhs, rhs);
        
    }
    
    ListNode merge(ListNode lhs, ListNode rhs){
        ListNode result= new ListNode();
        ListNode temp = result;
        
        while(lhs != null && rhs != null){
            if(lhs.val < rhs.val){
                temp.next = lhs;
                lhs = lhs.next;
            }else{
                temp.next = rhs;
                rhs = rhs.next;
            }
            temp = temp.next;
        }
        
        if(lhs != null){
            temp.next = lhs;
        }
        if(rhs!= null){
            temp.next = rhs;
        }
        return result.next;
    }
}