Problem Link ::: https://leetcode.com/problems/number-of-senior-citizens/description/

class Solution {
    public int countSeniors(String[] details) {
        int N = details.length;
        int count = 0;
        for (int i = 0 ; i < N ; i++) {
            int ch1 = details[i].charAt(11) - '0';
            int ch2 = details[i].charAt(12) - '0';
            if ((ch1 * 10) + ch2 > 60) {
                count++;
            }
        }
        return count;
    }
}

//TC : O(N) , SC (1)
