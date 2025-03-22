// Problem Link ::: https://leetcode.com/problems/find-peak-element/description/

class Solution {
    public int findPeakElement(int[] nums) {
        int N = nums.length;
        int ans = -1;
        if (N == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[N-1] > nums[N-2]) {
            return N-1;
        }
        int start = 1;
        int end = N-2;
        //Whichever side is greater to the mid , go to that side
        //If both sides are greater , you can go to any side
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {
                ans = mid;
                return ans;
            } else if (nums[mid-1] > nums[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }
}