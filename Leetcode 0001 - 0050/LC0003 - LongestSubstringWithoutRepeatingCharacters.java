// Problem Link ::: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int N = s.length();
        int start = 0;
        int end = 0;
        int ans = 0;
        HashSet<Character> mySet = new HashSet<>();
        while (end < N) {
            if (mySet.contains(s.charAt(end)) == false) {
                mySet.add(s.charAt(end));
                end++;
            } else {
                mySet.remove(s.charAt(start));
                start++;
            }
            ans = Math.max(ans, mySet.size());
        }
        return ans; 
    }
}