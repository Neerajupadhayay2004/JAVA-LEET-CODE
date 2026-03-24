1class Solution {
2    public boolean isMatch(String s, String p) {
3        int m = s.length();
4        int n = p.length();
5
6        boolean[][] dp = new boolean[m + 1][n + 1];
7        dp[0][0] = true;
8
9        // Handle patterns like a*, a*b*, a*b*c*
10        for (int j = 2; j <= n; j++) {
11            if (p.charAt(j - 1) == '*' && dp[0][j - 2]) {
12                dp[0][j] = true;
13            }
14        }
15
16        for (int i = 1; i <= m; i++) {
17            for (int j = 1; j <= n; j++) {
18                char sc = s.charAt(i - 1);
19                char pc = p.charAt(j - 1);
20
21                if (pc == '.' || pc == sc) {
22                    // direct match
23                    dp[i][j] = dp[i - 1][j - 1];
24                } 
25                else if (pc == '*') {
26                    // ensure j >= 2 (safe access)
27                    if (j >= 2) {
28                        // zero occurrence
29                        dp[i][j] = dp[i][j - 2];
30
31                        char prev = p.charAt(j - 2);
32
33                        // one or more occurrence
34                        if (prev == '.' || prev == sc) {
35                            dp[i][j] = dp[i][j] || dp[i - 1][j];
36                        }
37                    }
38                }
39            }
40        }
41
42        return dp[m][n];
43    }
44}