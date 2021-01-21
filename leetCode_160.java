/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        int lenA = len(headA);
        int lenB = len(headB);
        
        ListNode tempA = headA;
        ListNode tempB = headB;
        if(lenA > lenB){
            
            while(lenA > lenB){
                tempA= tempA.next;
                lenA--;
            }
        }else if(lenB > lenA){
            while(lenB > lenA){
                tempB = tempB.next;
                lenB--;
            }
        }
        
        while(tempA != null && tempB !=null){
            if(tempA == tempB) return tempA;
            tempA = tempA.next;
            tempB = tempB.next;
        }
        
        return null;
    }
    
    public int len(ListNode head){
        if(head == null){
            return 0;
        }
        int res=0;
        ListNode temp = head;
        while(temp != null){
            res++;
            temp=temp.next;
        }
        return res;
        
    }
       
}