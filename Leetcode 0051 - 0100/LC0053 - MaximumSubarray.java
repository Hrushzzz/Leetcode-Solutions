// Problem Link ::: https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        int N = nums.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

// Kadane's Algorithm
// TC : O(N) , SC : O(1)