1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3        // Case 1: both are null
4        if (p == null && q == null) {
5            return true;
6        }
7
8        // Case 2: one is null
9        if (p == null || q == null) {
10            return false;
11        }
12
13        // Case 3: values different
14        if (p.val != q.val) {
15            return false;
16        }
17
18        // Case 4: check left and right subtree
19        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
20    }
21}