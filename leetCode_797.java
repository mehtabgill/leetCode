class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        backtrack(0, list, graph);
        return result;
    }
    
    void backtrack(int index, List<Integer>list, int[][] graph){
        
            if(list.get(list.size()-1) == graph.length-1){
                List<Integer> ll = new ArrayList<>(list);
                result.add(ll);  
                return;
            }
            
            if(graph[index].length == 0) return;
    
        
        for(int i=0; i<graph[index].length; i++){
            int newIndex = graph[index][i];
            list.add(newIndex);
            backtrack(newIndex, list, graph);
            list.remove(list.size()-1);
        }
    }
}