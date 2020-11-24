class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<>();
        backtrack(output, "", 0, 0, n);
        return output;
    }
    
    void backtrack(List<String> output, String currentString, int open, int close, int max){
        if(currentString.length() == 2*max){
            output.add(currentString);
        }
        if(open < max) backtrack(output, currentString + "(", open + 1, close, max);
        if(close < open) backtrack(output, currentString + ")", open, close+1, max);
    }

}