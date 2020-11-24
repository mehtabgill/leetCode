
import java.util.*; 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Hashtable<String, List<String>> table = new Hashtable<>();
        
        for(int i=0; i<strs.length ; i++){
            
            
            char tempArray[] = strs[i].toCharArray(); 
            Arrays.sort(tempArray);
            String ns = new String(tempArray);
            
            if(table.get(ns) == null){
                List<String> ll = new ArrayList<>();
                ll.add(strs[i]);
                table.put(ns, ll);
            }else{
                List<String> ll = table.get(ns);
                ll.add(strs[i]);
                table.put(ns, ll);
            }
        }
        
        for(String i: table.keySet()){
            list.add(table.get(i));
        }
        
        return list;
    }
}