// Problem Link ::: https://leetcode.com/problems/sort-colors/description/

class Solution {
    public void sortColors(int[] nums) {
        int N = nums.length;
        for (int i = 0 ; i < N ; i++) {
            int swap = 0;
            for (int j = 0 ; j < N - 1 ; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                break;
            }
        }
    }
}

// This is solved using Bubble sort
// TC : O(N^2) , SC : O(1)