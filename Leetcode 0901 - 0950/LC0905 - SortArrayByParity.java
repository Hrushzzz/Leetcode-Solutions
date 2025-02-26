// Problem Link ::: https://leetcode.com/problems/sort-array-by-parity/description/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int N = nums.length;
        int j = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
}