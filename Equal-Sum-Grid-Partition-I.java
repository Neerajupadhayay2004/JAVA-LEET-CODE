1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        long total = 0;
7
8        // Step 1: Total sum
9        for (int i = 0; i < m; i++) {
10            for (int j = 0; j < n; j++) {
11                total += grid[i][j];
12            }
13        }
14
15        // If odd → not possible
16        if (total % 2 != 0) return false;
17
18        long target = total / 2;
19
20        // Step 2: Horizontal cut
21        long sum = 0;
22        for (int i = 0; i < m - 1; i++) {
23            for (int j = 0; j < n; j++) {
24                sum += grid[i][j];
25            }
26            if (sum == target) return true;
27        }
28
29        // Step 3: Vertical cut
30        sum = 0;
31        for (int j = 0; j < n - 1; j++) {
32            for (int i = 0; i < m; i++) {
33                sum += grid[i][j];
34            }
35            if (sum == target) return true;
36        }
37
38        return false;
39    }
40}