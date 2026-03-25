1class Solution {
2    List<List<String>> result = new ArrayList<>();
3    boolean[] cols;
4    boolean[] diag1;
5    boolean[] diag2;
6
7    public List<List<String>> solveNQueens(int n) {
8        cols = new boolean[n];
9        diag1 = new boolean[2 * n - 1];
10        diag2 = new boolean[2 * n - 1];
11
12        char[][] board = new char[n][n];
13        for (char[] row : board) {
14            Arrays.fill(row, '.');
15        }
16
17        backtrack(0, board, n);
18        return result;
19    }
20
21    private void backtrack(int row, char[][] board, int n) {
22        if (row == n) {
23            result.add(construct(board));
24            return;
25        }
26
27        for (int col = 0; col < n; col++) {
28            int d1 = row - col + n - 1;
29            int d2 = row + col;
30
31            if (cols[col] || diag1[d1] || diag2[d2]) continue;
32
33            board[row][col] = 'Q';
34            cols[col] = diag1[d1] = diag2[d2] = true;
35
36            backtrack(row + 1, board, n);
37
38            board[row][col] = '.';
39            cols[col] = diag1[d1] = diag2[d2] = false;
40        }
41    }
42
43    private List<String> construct(char[][] board) {
44        List<String> list = new ArrayList<>();
45        for (char[] row : board) {
46            list.add(new String(row));
47        }
48        return list;
49    }
50}
51