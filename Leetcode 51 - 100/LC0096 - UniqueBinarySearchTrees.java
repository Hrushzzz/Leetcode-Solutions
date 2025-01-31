// Problem Link ::: https://leetcode.com/problems/unique-binary-search-trees/description/

class Solution {
    public int numTrees(int n) {
        int[] catalanNum = new int[n+1];
        catalanNum[0] = 1;
        catalanNum[1] = 1;
        for (int i = 2 ; i <= n ; i++) {
            int sum = 0;
            for (int j = 0 ; j < i ; j++) {
                sum = sum + (catalanNum[j] * catalanNum[i - j -1]);
            }
            catalanNum[i] = sum;
        }
        return catalanNum[n];    
    }
}
