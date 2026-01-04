// Problem Link ::: https://leetcode.com/problems/reverse-words-in-a-string/description/

class Solution {
    public String reverseWords(String s) {
        int N = s.length();
        int start = 0;
        int end = 0;
        int i = 0;
        List<String> words = new ArrayList<>();
        while(i < N) {
            while(i < N && s.charAt(i) == ' ') {
                i++;
            }
            if(i >= N) {
                break;
            } 
            start = i;
            while(i < N && s.charAt(i) != ' ') {
                i++;
            }
            end = i - 1;
            String wordFound = s.substring(start, end+1);
            words.add(wordFound);
        }

        StringBuilder sb = new StringBuilder();
        for(int j = words.size() - 1; j >= 0; j--) {
            sb.append(words.get(j));
            if(j > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}