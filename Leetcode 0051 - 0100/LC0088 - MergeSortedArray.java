// Problem Link ::: https://leetcode.com/problems/merge-sorted-array/description/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1 , j = n-1;
        int index = nums1.length-1;
        //adding elements into the array
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[index] = nums2[j];
                j--;
                index--;
            } else {
                nums1[index] = nums1[i];
                i--;
                index--;
            }
        }
        //adding left overs - array nums1
        while (i >= 0) {
            nums1[index] = nums1[i];
            i--;
            index--;
        }
        //adding left overs - array nums2
        while (j >= 0) {
            nums1[index] = nums2[j];
            j--;
            index--;
        }
    }
}