class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        if(strs.length == 0){
            return res;
        }
        res = strs[0];
        for(int i=1; i<strs.length; i++){
            String ss = strs[i];
            int len = ss.length() <= res.length() ? ss.length() : res.length();
            ss = ss.substring(0, len);
            res = res.substring(0, len);
            for(int j=res.length(); j >= 1; j -- ){
                if(res.substring(0, j).equals(ss.substring(0, j))){
                    res = res.substring(0, j);
                    break;
                }
                if(j == 1){
                    return "";
                }
                 
            }
        }
        return res;
    }
}