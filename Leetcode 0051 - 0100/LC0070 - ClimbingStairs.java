Problem Link ::: https://leetcode.com/problems/climbing-stairs/description/

class Solution {
    int[] dp;
    int stairs (int i) {
        if (i <= 2) {
            return i;
        }
        if (dp[i] == -1) {
            dp[i] = stairs(i-1) + stairs(i-2);
        }
        return dp[i];
    }
    //climbStairs --> main function
    public int climbStairs(int n) {
        dp  = new int[n+1];
        for (int i = 0  ; i <= n ; i++) {
            dp[i] = -1;
        }
        return stairs(n);  
    }
}
