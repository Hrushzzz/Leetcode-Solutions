Problem Link ::: https://leetcode.com/problems/subarray-sum-equals-k/description/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int N = nums.length;
        int[] psum = new int[N];
        psum[0] = nums[0];
        for (int i = 1 ; i < N ; i++) {
            psum[i] = psum[i-1] + nums[i];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        map.put(0,1);
        for (int i = 0 ; i < N ; i++) {
            int target = psum[i] - k;
            if (map.containsKey(target)) {
                count += map.get(target);
            }
            int freq = map.getOrDefault(psum[i],0);
            map.put(psum[i] , freq+1);
        }
        return count;
    }
}
