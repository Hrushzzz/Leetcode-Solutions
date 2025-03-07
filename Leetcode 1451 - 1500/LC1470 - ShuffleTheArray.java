// Problem Link ::: https://leetcode.com/problems/shuffle-the-array/description/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] ans = new int[len];
        int i = 0;
        int j = n;
        int index = 0;
        while ((i < n) && (j < len)) {
            ans[index] = nums[i];
            ans[index + 1] = nums[j];
            i++;
            j++;
            index += 2;
        }
        return ans;
    }
}