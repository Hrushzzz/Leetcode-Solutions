// Problem Link ::: https://leetcode.com/problems/valid-parentheses/description/

class Solution {
    public boolean isValid(String s) {
        int N = s.length();
        Stack<Character> myStack = new Stack<Character>();
        for (int i = 0 ; i < N ; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                myStack.push(s.charAt(i));
            } else {
                if (myStack.size() == 0) {
                    return false;
                }
                if (myStack.peek() == '(' && s.charAt(i) == ')') {
                    myStack.pop();
                } else if (myStack.peek() == '[' && s.charAt(i) == ']') {
                    myStack.pop();
                } else if (myStack.peek() == '{' && s.charAt(i) == '}'){
                    myStack.pop();
                } else {
                    return false;
                }
            }
        }
        if (myStack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}

// SC : O(N) , SC : O(N)