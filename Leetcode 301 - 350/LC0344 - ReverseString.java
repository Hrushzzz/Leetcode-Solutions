// Problem Link ::: https://leetcode.com/problems/reverse-string/

class Solution {
    public void reverseString(char[] s) {
        int N = s.length;
        int start = 0 , end = N-1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }  
    }
}