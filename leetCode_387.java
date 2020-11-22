class Solution {
    public int firstUniqChar(String s) {
        int res = -1;
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<s.length();i++){
            if(map.get(s.substring(i, i+1)) == null){
                map.put(s.substring(i, i+1), i);
                list.add(i);
                continue;
            }else{
                list.remove(map.get(s.substring(i, i+1)));
            }
        }
        if(list.size() == 0){
            return -1;
        }
        
        return list.get(0);
    }
}