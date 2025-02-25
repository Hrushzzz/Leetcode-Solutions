// Problem Link ::: https://leetcode.com/problems/find-pivot-index/description/

class Solution {
    public int pivotIndex(int[] nums) {
        int N = nums.length;
        int[] prefixSum = new int[N];
        prefixSum[0] = nums[0];
        for (int i = 1; i < N; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        for (int i = 0; i < N; i++) {
            int left = 0;
            if (i == 0) {
                left = 0;
            } else {
                // sum of all elements from index 0 up to (and including) index i-1
                left = prefixSum[i-1];
            }
            // sum of the elements from index i+1 to N-1
            int right = prefixSum[N-1] - prefixSum[i];
            if (left  == right) {
                return i;
            }
        }
        return -1;
    }
}

// TC : O(N) , SC : O(N)