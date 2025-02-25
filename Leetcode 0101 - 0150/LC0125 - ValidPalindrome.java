// Problem Link ::: https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        int N = s.length();
        s = s.toLowerCase();
        int start = 0;
        int end = N - 1;
        while (start < end) {
            if (!((s.charAt(start) >= 'a' && s.charAt(start) <= 'z') || (s.charAt(start) >= '0'
                    && s.charAt(start) <= '9'))) {
                start++;
                continue;
            }
            if (!((s.charAt(end) >= 'a' && s.charAt(end) <= 'z') || (s.charAt(end) >= '0'
                    && s.charAt(end) <= '9'))) {
                end--;
                continue;
            }
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}