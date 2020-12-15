class ExamRoom {
    
    List<Integer> list = new ArrayList<>();
    int limit = 0;
    public ExamRoom(int N) {
        limit = N-1;
    }
    
    public int seat() {
        if(list.size() == 0){
            list.add(0);
            return 0;
        }
        int d = Math.max(list.get(0), limit - list.get(list.size()-1));
        boolean innerGap = false;
        for(int i=0; i < list.size()-1; i++){
            d = Math.max(d, (list.get(i+1) - list.get(i))/2);
        }
        
        if(d == list.get(0)){
            list.add(0, 0);
            return 0;
        }
         for (int i = 0; i < list.size() - 1; ++i)
            if ((list.get(i + 1) - list.get(i)) / 2 == d) {
                list.add(i + 1, (list.get(i + 1) + list.get(i)) / 2);
                return list.get(i + 1);
            }
        list.add(limit);
        return limit;
        
    }
    
    public void leave(int p) {
        for(int i=0; i<list.size();i++){
            if(p == list.get(i)){
                list.remove(i);
            }
        }
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(N);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */