1class Solution {
2    public String longestPalindrome(String s) {
3        if (s == null || s.length() < 1) return "";
4
5        int start = 0, maxLen = 1;
6
7        for (int i = 0; i < s.length(); i++) {
8            // Odd length palindrome
9            int len1 = expandFromCenter(s, i, i);
10            // Even length palindrome
11            int len2 = expandFromCenter(s, i, i + 1);
12
13            int len = Math.max(len1, len2);
14
15            if (len > maxLen) {
16                maxLen = len;
17                start = i - (len - 1) / 2;
18            }
19        }
20
21        return s.substring(start, start + maxLen);
22    }
23
24    private int expandFromCenter(String s, int left, int right) {
25        while (left >= 0 && right < s.length()
26                && s.charAt(left) == s.charAt(right)) {
27            left--;
28            right++;
29        }
30        return right - left - 1;
31    }
32}
33