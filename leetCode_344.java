class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int mid  = len/2;
        for(int i=0; i<mid;i++){
            char temp = s[i];
            s[i] = s[len -1 -i];
            s[len -1 -i] = temp;
        }
    }
}