// Problem Link ::: https://leetcode.com/problems/missing-number/description/

class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int totalSum = (N * (N + 1)) / 2;
        int sum = 0;
        for (int i = 0 ; i < N ; i++) {
            sum += nums[i];
        }
        return totalSum - sum;
    }
}