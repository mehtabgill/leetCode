class CustomStack {
    
    int maxsize ;
    Stack<Integer> stack = new Stack<>();
    int arr[];
    public CustomStack(int maxSize) {
        maxsize = maxSize;
        arr = new int[maxSize];
    }
    
    public void push(int x) {
        if(stack.size() < maxsize){
            stack.push(x);
        }
    }
    
    public int pop() {
        int i = stack.size() - 1;
        if(i < 0) return -1;
        
        if(i > 0 ) arr[i-1] += arr[i];
        
        int res  = stack.pop() + arr[i];
        arr[i]=0;
        return res;
    }
    
    public void increment(int k, int val) {
        if(stack.isEmpty()){
            return;
        }
        int safe = Math.min(k, stack.size()) -1 ;
        arr[safe] += val;
        
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */