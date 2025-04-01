// Problem Link ::: https://leetcode.com/problems/find-lucky-integer-in-an-array/description/

class Solution {
    public int findLucky(int[] arr) {
        int [] freqArr = new int[501];
        for(int i = 0; i < arr.length; i++){
          freqArr[arr[i]]++;
        }
        int ans = -1;
        for(int i = 1; i <= 500; i++){
            if(freqArr[i] == i){
                ans = i;
            }
        }
        return ans;
    }
}