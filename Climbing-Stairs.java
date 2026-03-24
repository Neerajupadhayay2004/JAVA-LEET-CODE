1class Solution {
2    public int climbStairs(int n) {
3        if (n <= 2) return n;
4
5        int prev1 = 2; // ways to reach step 2
6        int prev2 = 1; // ways to reach step 1
7
8        for (int i = 3; i <= n; i++) {
9            int current = prev1 + prev2;
10            prev2 = prev1;
11            prev1 = current;
12        }
13
14        return prev1;
15    }
16}