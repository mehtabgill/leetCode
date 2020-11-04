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
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode oddPtr = head;
        ListNode evenPtr = head.next;
        int currentIndex = 2;
        while(evenPtr.next != null){
            if(currentIndex % 2 == 0){
                ListNode newodd = evenPtr.next;
                ListNode nextForLst = oddPtr.next;
                oddPtr.next = evenPtr.next;
                evenPtr.next = newodd.next;
                newodd.next = nextForLst;
                
                currentIndex++;
                // Update main pointers
                oddPtr = oddPtr.next;
            }else{
                evenPtr = evenPtr.next;
                currentIndex++;
            }
        }
        return head;
    }
}