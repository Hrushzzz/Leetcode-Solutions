Problem Link ::: https://leetcode.com/problems/spiral-matrix-ii/description/

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int i = 0 , j = 0 , num = 1;
        while (n > 1) {
            for (int start = 1 ; start < n ; start++) {   //first row
                matrix[i][j] = num;
                j++;
                num++;
            }
            for (int start = 1 ; start < n ; start++) {   //last column
                matrix[i][j] = num;
                i++;
                num++;
            }
            for (int start = 1 ; start < n ;start++) {    //last row
                matrix[i][j] = num;
                j--;
                num++;
            }
            for (int start = 1 ; start < n ; start++) {    //first column
                matrix[i][j] = num;
                i--;
                num++;
            }
            i++ ; j++ ; n = n-2;
        }
        if (n == 1) {
            matrix[i][j] = num;
        } 
        return matrix;
    }
}

// TC : O(N * N) , SC : O(1)
