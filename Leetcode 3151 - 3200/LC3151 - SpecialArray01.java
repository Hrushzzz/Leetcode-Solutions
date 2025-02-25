// Problem Link ::: https://leetcode.com/problems/special-array-i/description/

class Solution {
    public boolean isArraySpecial(int[] nums) {
        int N = nums.length;
        if (N == 1) {
            return true;
        }
        int start = 0;
        while (start < N-1) {
            if((nums[start] + nums[start+1]) % 2 == 0) {
                return false;
            }
            start++;
        }
        return true;
    }
}