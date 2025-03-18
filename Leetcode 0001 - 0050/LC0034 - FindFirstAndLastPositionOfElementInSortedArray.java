// Problem Link ::: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int N = nums.length;
        int[] finalArr = {-1 , -1};
        int start = 0 , end = N-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                finalArr[0] = mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        if (finalArr[0] == -1) {
            return finalArr;
        }
        start = finalArr[0] ; end = N-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                finalArr[1] = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return finalArr;
    }
}