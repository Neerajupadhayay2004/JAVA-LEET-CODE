1class Solution {
2    int count = 0;
3    boolean[] cols;
4    boolean[] diag1;
5    boolean[] diag2;
6
7    public int totalNQueens(int n) {
8        cols = new boolean[n];
9        diag1 = new boolean[2 * n - 1];
10        diag2 = new boolean[2 * n - 1];
11
12        backtrack(0, n);
13        return count;
14    }
15
16    private void backtrack(int row, int n) {
17        if (row == n) {
18            count++;
19            return;
20        }
21
22        for (int col = 0; col < n; col++) {
23            int d1 = row - col + n - 1;
24            int d2 = row + col;
25
26            if (cols[col] || diag1[d1] || diag2[d2]) continue;
27
28            cols[col] = diag1[d1] = diag2[d2] = true;
29            backtrack(row + 1, n);
30            cols[col] = diag1[d1] = diag2[d2] = false;
31        }
32    }
33}
34