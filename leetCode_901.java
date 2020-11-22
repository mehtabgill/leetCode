class StockSpanner {
    Stack<Integer> stack ;
    int count;
    List<Integer> list;
    public StockSpanner() {
        stack = new Stack<>();
        list  = new ArrayList<>();
        count = 0;
    }
    
    public int next(int price) {
        if(stack.isEmpty()){
            stack.push(price);
            list.add(1);
            return 1;
        }
        if(stack.peek() > price){
            stack.push(price);
            list.add(1);
            return 1;
        }
        int now = 0;
        int i= list.size()-1;
        while(!stack.isEmpty() && price >= stack.peek()){
            stack.pop();
            now += list.get(i);
            list.remove(i);
            i--;
        }
        stack.push(price);
        
        now++;
        list.add(now);
        return now;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */