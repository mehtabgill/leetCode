/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        
        Node tempHead = head;
        Node result = new Node(tempHead.val);
        
        HashMap<Node, Node> map = new HashMap<>();
       
        map.put(tempHead, result);
        
        Node tempRes = result;
        
        while(tempHead != null){
            if(tempHead.next == null) tempRes.next = null;
            else if(map.get(tempHead.next) != null){
                tempRes.next = map.get(tempHead.next);
            }else{
                Node nn = new Node(tempHead.next.val);
                tempRes.next = nn;
                map.put(tempHead.next, nn);
            }
            
            if(tempHead.random == null) tempRes.random = null;
            else if(map.get(tempHead.random) != null){
                tempRes.random = map.get(tempHead.random);
            }else{
                Node nn = new Node(tempHead.random.val);
                tempRes.random = nn;
                map.put(tempHead.random, nn);
            }
            
            
            tempHead = tempHead.next;
            tempRes = tempRes.next;
            
        }
        
        
        
        
        return result;
        
    }
}