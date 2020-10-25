class Solution {
    public ListNode insertionSortList(ListNode head) {
      
        if( head == null ){
                    return head;
        }
        
        ListNode temp = new ListNode(0);
        ListNode current = head;
        ListNode prev = temp;
        ListNode leftOver = null;
        while(current != null){
          leftOver = current.next;
            
            while(prev.next != null && prev.next.val < current.val){
                prev = prev.next;
            }
            
            current.next = prev.next;
            prev.next = current;
            prev = temp;
            current = leftOver;
            
        }
        
        return temp.next; 
    }
}