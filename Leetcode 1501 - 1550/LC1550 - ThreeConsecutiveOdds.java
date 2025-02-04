Problem Link ::: https://leetcode.com/problems/three-consecutive-odds/description/

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int N = arr.length;
        int count = 0;
        for (int i = 0 ; i < N ; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}

// TC : O(N) , SC : O(1)
