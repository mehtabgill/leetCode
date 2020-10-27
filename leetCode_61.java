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
    //     public ListNode rotateRight(ListNode head, int k) {
            
    //         if(head == null){
    //             return head;
    //         }
    //         int val = head.val;
    //         ListNode result = head;
    //         ListNode previous = result;
    //         ListNode current = result;
    //         ListNode tt = head;
    //         int count =0 ;
    //         while(tt != null){
    //             count++;
    //             tt = tt.next;
    //         }
            
    //         for(int i=1; i<= (k%count); i++){
    //           while(current.next != null){
    //               previous = current;
    //               current = current.next;
    //           }
    //             current.next = result;
    //             previous.next = null; 
    //             result = current;
    //         }
    //         return result; 
    //     }
       public ListNode rotateRight(ListNode head, int k) {
    
            if(head == null || head.next == null){
                return head;
            }
            ListNode result = head;
            ListNode last = result;
            ListNode toBefirst = result;
           
           int count = 0;
            while(last.next != null){
                last = last.next;
                count++;
            }
           count++;
           
           for(int i=0; i< count - (k%count) -1; i++){
               toBefirst = toBefirst.next;
           }
           
           last.next = result;
           result = toBefirst.next;
           toBefirst.next = null;
           
           return result;
           
       }    
    }