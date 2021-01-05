class Solution {
    public String removeDuplicateLetters(String s) {
        String res = "";
        
        int[] freqs = new int[26];
        boolean[] visited = new boolean[26];
         char[] ch = s.toCharArray();
        for(char c: ch){
            freqs[c - 'a']++;
        }
        Stack<Character> stack = new Stack<>();

        for(char c: ch){
            freqs[c - 'a']--;
            if(visited[c-'a']) continue;
            
            while(stack.size() > 0 && c < stack.peek() && freqs[stack.peek()-'a'] > 0){
                visited[stack.pop() - 'a'] = false;
            }
            
            stack.push(c);
            visited[c - 'a'] = true;
        }
        
        StringBuilder sb = new StringBuilder(stack.size());
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}