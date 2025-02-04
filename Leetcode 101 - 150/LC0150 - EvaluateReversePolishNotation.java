// Problem Link ::: https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

class Solution {
    public int evalRPN(String[] tokens) {
        int N = tokens.length;
        Stack<Integer> myStack = new Stack<Integer>();
        for (int i = 0 ; i < N ; i++) {
            char ch = tokens[i].charAt(0);
            if ((ch == '+' || ch == '-' || ch == '*' || ch == '/') && (tokens[i].length() == 1)) {
                int b = myStack.peek();
                myStack.pop();
                int a = myStack.peek();
                myStack.pop();
                if (ch == '+') {
                    myStack.push(a + b);
                } else if (ch == '-') {
                    myStack.push(a - b);
                } else if (ch == '*') {
                    myStack.push(a * b);
                } else if (ch == '/') {
                    myStack.push(a / b);
                }
            } else {
                myStack.push(Integer.parseInt(tokens[i]));
            }
        }
        return myStack.peek();  
    }
}
