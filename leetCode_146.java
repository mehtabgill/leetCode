class LRUCache {

    class Node {
        int key;
        int val;
        Node post;
        Node pre;

        public Node(int key, int value){
            this.key = key;
            this.val = value;
            this.post = null;
            this.pre = null;
        }
    
    }
    
    private void moveToHead(Node node){
        
        removeNode(node);
        
        addAtHead(node);
    }
    
    private void addAtHead(Node node){
        Node head_post = head.post;
        
        node.post = head_post;
        
        head.post = node;
        
        node.pre = head;
        
        head_post.pre = node;
    }
    
    private void removeNode(Node node){
        
        Node pre = node.pre;
        Node post = node.post;
        
        pre.post = post;
        post.pre = pre;
        
    }
    private Node removeTail(){
       Node res = tail.pre;
        
        removeNode(res);
        
        return res;
    }
    
    
    
    
    HashMap<Integer, Node> map = new HashMap<>();
    // private variables
    private Node head, tail;
    int capacity;
    
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        
        head = new Node(0,0);
        
        tail = new Node(0,0);
        
        head.post = tail;
        tail.pre = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        
        Node temp = map.get(key);
        
        moveToHead(temp);
        
        return temp.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val =value;
            moveToHead(node);
        }else{
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addAtHead(newNode);
            if(map.size() > this.capacity){
                Node toRemove = removeTail();
                map.remove(toRemove.key);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */