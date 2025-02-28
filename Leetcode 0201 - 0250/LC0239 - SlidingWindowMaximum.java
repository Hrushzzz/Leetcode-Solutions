Problem Link ::: https://leetcode.com/problems/sliding-window-maximum/description/ 

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int N = nums.length;
        int[] finalArr = new int[N-k+1];
        //total number of subarrays of size k possible in Array of size N : N-k+1
        int index = 0;
        Deque <Integer> myDeque = new ArrayDeque<>();
        //sliding for the first window
        for (int i = 0 ; i < k ; i++) {
            while (myDeque.size() > 0 && nums[i] > myDeque.getLast()) {
                myDeque.removeLast();
            }
            myDeque.addLast(nums[i]);
        }
        finalArr[index] = myDeque.getFirst();
        index++;
        int start = 1 , end = k;
        //sliding for the next windows of the Array
        while (end < N) {
            //removing nums[start-1] from the Deque , as it will be removed out of window
            if (myDeque.getFirst() == nums[start-1]) {
                myDeque.removeFirst();
            }
            while (myDeque.size() > 0 && nums[end] > myDeque.getLast()) {
                myDeque.removeLast();
            }
            myDeque.addLast(nums[end]);
            finalArr[index] = myDeque.getFirst();
            index++;
            start++;
            end++;
        }
        return finalArr;
    }
}

//TC : O(N) , SC : O(N)
