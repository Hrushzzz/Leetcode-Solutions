// Problem Link ::: https://leetcode.com/problems/ways-to-make-a-fair-array/description/

class Solution {
    public int waysToMakeFair(int[] nums) {
        int N = nums.length;
        int[][] EvenOdd = new int[N][2];
        EvenOdd[0][0] = nums[0];
        EvenOdd[0][1] = 0; 
        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) {
                EvenOdd[i][0] = nums[i] + EvenOdd[i-1][0];
                EvenOdd[i][1] = EvenOdd[i-1][1];
            } else {
                EvenOdd[i][0] = EvenOdd[i-1][0];
                EvenOdd[i][1] = nums[i] + EvenOdd[i-1][1];   
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            int evenSumTill = (i > 0) ?  EvenOdd[i - 1][0] - nums[i] : 0;
            int oddSumTill = (i > 0) ? EvenOdd[i-1][1] - nums[i]: 0;
            int evenSumAfter = EvenOdd[N-1][0] - EvenOdd[i][0];
            int oddSumAfter = EvenOdd[N-1][1] - EvenOdd[i][1];
            if (evenSumTill + oddSumAfter == oddSumTill + evenSumAfter) {
                count++;
            } 
        }
        return count; 
    }
}