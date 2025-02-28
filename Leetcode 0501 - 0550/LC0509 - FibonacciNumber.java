Problem Link ::: https://leetcode.com/problems/fibonacci-number/description/

class Solution {
    int[] dp;
    int sequence(int A) {
        if (A <= 1) {
            return A;
        }
        if (dp[A] == -1) {
            dp[A] = sequence(A-1) + sequence(A-2);
        }
        return dp[A];
    }
    public int fib(int n) {
        dp = new int[n+1];
        for (int i = 0 ; i <= n ; i++) {
            dp[i] = -1;
        }
        return sequence(n);
    }
}

// TC  : O(N) , SC : O(N)
