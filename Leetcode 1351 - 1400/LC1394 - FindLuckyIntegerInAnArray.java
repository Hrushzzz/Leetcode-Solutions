// Problem Link ::: https://leetcode.com/problems/find-lucky-integer-in-an-array/description/

class Solution {
    public int findLucky(int[] arr) {
        int N = arr.length;
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (myMap.containsKey(arr[i]) == false) {
                myMap.put(arr[i], 1);
            } else {
                int freq = myMap.get(arr[i]);
                myMap.put(arr[i], freq+1);
            }
        }
        int max = -1;
        for (int i = 0; i < N; i++) {
            int numToCheck = arr[i];
            if (myMap.get(arr[i]) == numToCheck) {
                if (myMap.get(arr[i]) > max) {
                    max = numToCheck;
                }
            }
        }
        return max;
    }
}