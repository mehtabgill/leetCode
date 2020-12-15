class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashMap<Integer, Set<Integer>> rowMap = new HashMap<>();
        HashMap<Integer, Set<Integer>> colMap = new HashMap<>();
        
        
        for(int rowS=0; rowS<=8; rowS += 3){
            int rowE = rowS + 2;
            for(int colS=0; colS<=8; colS += 3){
                int colE = colS + 2;
                
                // one sub-box
                Set<Integer> subBox = new HashSet<>();
                for(int i=rowS; i<= rowE; i++){
                    for(int j=colS; j<=colE; j++){
                        if(board[i][j] != '.'){
                            int val = Character.getNumericValue(board[i][j]);
                            
                            if(val < 1 || val > 10) return false;
                            if(subBox.contains(val)) return false;
                            if(rowMap.containsKey(i) && rowMap.get(i).contains(val)) return false;
                            
                            if(colMap.containsKey(j) && colMap.get(j).contains(val)) return false;


                            subBox.add(val);
                            
                            if(!rowMap.containsKey(i)){
                                Set<Integer> s = new HashSet<>();
                                s.add(val);
                                rowMap.put(i, s);
                            }
                            else if(rowMap.containsKey(i)){
                                Set<Integer> s = rowMap.get(i);
                                s.add(val);
                                rowMap.put(i, s);
                            }
                            if(!colMap.containsKey(j)){
                                Set<Integer> s = new HashSet<>();
                                s.add(val);
                                colMap.put(j, s);
                            }
                            else if(colMap.containsKey(j)){
                                Set<Integer> s = colMap.get(j);
                                s.add(val);
                                colMap.put(j, s);
                            }
                        
                        }
                    }
                }
                subBox.clear();
            
            }
        }
        
        return true;
    }
}               