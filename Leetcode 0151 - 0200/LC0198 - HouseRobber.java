// Problem Link ::: https://leetcode.com/problems/house-robber/

class Solution {
    int[] dp;
    //overlapping subproblems code
    int maxSum(int[] A , int i) {
        if (i < 0) {  //base case
            return 0;
        }
        if(dp[i] == -1) {  //coming for the first time 
            dp[i] = Math.max(maxSum(A, i-1) , maxSum(A, i-2) + A[i]);
        }
        return dp[i];
    }
    //rob --> main function
    public int rob(int[] nums) {
        int N = nums.length;
        dp = new int[N];
        for (int i = 0 ; i < N ; i++) {
            dp[i] = -1;
        }
        return maxSum(nums , N-1);
    }
}

//TC : O(N) , SC : O(N)
