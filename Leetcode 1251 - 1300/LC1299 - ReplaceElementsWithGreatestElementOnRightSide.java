// Problem Link ::: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/

class Solution {
    public int[] replaceElements(int[] arr) {
        int N = arr.length;
        int[] ans = new int[N];
        ans[N-1] = -1;
        int previousMax = arr[N-1];
        for (int i = N-2; i >= 0; i--) {
            ans[i] = previousMax;
            int currentMax = arr[i];
            if (currentMax > previousMax) {
                previousMax = currentMax;
            }
        }
        return ans;
    }
}