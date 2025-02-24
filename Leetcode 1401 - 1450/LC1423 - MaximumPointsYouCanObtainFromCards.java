// Problem Link ::: https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans += cardPoints[i];
        }
        int max = ans;
        int N = cardPoints.length - 1;
        for (int i = 0; i < k; i++) {
            ans -= cardPoints[k - i - 1];
            ans += cardPoints[N - i];
            if (ans > max) {
                max = ans;
            }
        }
        return max;
    }
}