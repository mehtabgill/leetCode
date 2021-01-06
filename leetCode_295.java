class MedianFinder {

    /** initialize your data structure here. */
    PriorityQueue<Integer> left_pq;
    PriorityQueue<Integer> right_pq;
    public MedianFinder() {
        left_pq = new PriorityQueue<>(Collections.reverseOrder());
        right_pq = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(right_pq.size() > 0 && num > right_pq.peek()){
            right_pq.offer(num);
        }else{
            left_pq.offer(num);
        }
        
        if(left_pq.size() - right_pq.size() > 1){
            right_pq.offer(left_pq.poll());
        }else if(right_pq.size() - left_pq.size() > 1){
            left_pq.offer(right_pq.poll());
        }
    }
    
    public double findMedian() {
       if(left_pq.size() == right_pq.size()) return (double)(left_pq.peek()+right_pq.peek())/2;
        return left_pq.size() > right_pq.size() ? (double)left_pq.peek() : (double)right_pq.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */