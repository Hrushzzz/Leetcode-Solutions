// Problem Link ::: https://leetcode.com/problems/unique-paths-ii/

class Solution {
    int[][] dp;
    //overlapping subproblems code
    int ways (int i , int j , int[][] matrix) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (matrix[i][j] == 1) {
            return 0;
        }
        if (i == 0 && j == 0) {
            return 1;
        }
        if (dp[i][j] == -1) {
            dp[i][j] = ways(i-1 , j , matrix) + ways(i , j-1 , matrix);
        }
        return dp[i][j];
    }
    //uniquePathsWithObstacles --> main function
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        dp = new int[m][n];
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                dp[i][j] = -1;
            }
        }
        return ways(m-1 , n-1 , obstacleGrid);
    }
}

//dp[i][j] --> ways to reach A[i][j]
//dp[N-1][M-1] --> ways to reach dp[N-1][M-1]

// TC : O(N * M) , SC : O(N * M)
