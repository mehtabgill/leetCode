class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        
        int[] freq = new int[26];
        for(int i=0; i < S.length(); i++){
            freq[S.charAt(i) - 'a'] = i;
        }
        
        int start=0;
        int last=0;
        
        for(int i = 0; i < S.length(); i++){
            last = Math.max(last, freq[S.charAt(i) - 'a']);
            if(i == last){
                int len = last - start + 1;
                result.add(len);
                start = last+1;
            }
        }
        
        return result; 
    }
}