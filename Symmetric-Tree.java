1class Solution {
2    public boolean isSymmetric(TreeNode root) {
3        return isMirror(root.left, root.right);
4    }
5
6    private boolean isMirror(TreeNode left, TreeNode right) {
7        if (left == null && right == null) return true;
8        if (left == null || right == null) return false;
9
10        return (left.val == right.val)
11            && isMirror(left.left, right.right)   // outer pair
12            && isMirror(left.right, right.left);  // inner pair
13    }
14}