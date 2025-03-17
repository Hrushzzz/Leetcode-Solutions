// Problem Link ::: https://leetcode.com/problems/single-element-in-a-sorted-array/description/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int N = nums.length;
        int start = 0;
        int end = N-1;
        if (N == 1) {
            return nums[0];
        }
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[N-1] != nums[N-2]) {
            return nums[N-1];
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid % 2 == 1) {
                mid--;
            } 
            if (nums[mid] == nums[mid+1]) {
                start = mid + 2;
            } else {
                end = mid - 1;
            }
        }
        return nums[start];
    }
}

// TC : O(log N) , SC : O(1)