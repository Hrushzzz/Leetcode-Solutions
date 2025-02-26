// Problem Link ::: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution {
    public int removeDuplicates(int[] nums) {
        int N = nums.length;
        int j = 1;
        for (int i = 1 ; i < N ; i++) {
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    } 
}

// TC : O(N) , SC : O(1)