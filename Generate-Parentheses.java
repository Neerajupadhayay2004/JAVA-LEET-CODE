1import java.util.*;
2
3class Solution {
4    public List<String> generateParenthesis(int n) {
5        List<String> result = new ArrayList<>();
6        backtrack(result, "", 0, 0, n);
7        return result;
8    }
9
10    private void backtrack(List<String> result, String current, int open, int close, int n) {
11        // Base case
12        if (current.length() == n * 2) {
13            result.add(current);
14            return;
15        }
16
17        // Add '('
18        if (open < n) {
19            backtrack(result, current + "(", open + 1, close, n);
20        }
21
22        // Add ')'
23        if (close < open) {
24            backtrack(result, current + ")", open, close + 1, n);
25        }
26    }
27}