// Problem Link ::: https://leetcode.com/problems/reverse-integer/description/

class Solution {
    public int reverse(int x) {
        int copy = x;
        int rev = 0;
        if (x < 0) {
            x *= -1;
        }
        while (x > 0) {
            int d  = x % 10;
            int rev_temp = rev;
            rev = rev * 10 + d;
            int rev_temp2 = (rev - d) / 10;
            if (rev_temp != rev_temp2) {
                return 0 ;
            }
            x = x/10;
        }
        if (copy < 0) {
            rev = rev * -1;
        }
            return rev;            
    }    
}
