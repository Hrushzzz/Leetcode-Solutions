// Problem Link ::: https://leetcode.com/problems/contains-duplicate-ii/description/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (freqMap.containsKey(nums[i]) == true) {
                if ((i - freqMap.get(nums[i])) <= k) {
                    return true;
                }
            }
            freqMap.put(nums[i], i);
        }
        return false;
    }
}