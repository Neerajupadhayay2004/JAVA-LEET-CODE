1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    TreeNode prev = null;
18
19    public boolean isValidBST(TreeNode root) {
20        return inorder(root);
21    }
22
23    private boolean inorder(TreeNode node) {
24        if (node == null) return true;
25
26        if (!inorder(node.left)) return false;
27
28        if (prev != null && node.val <= prev.val) return false;
29        prev = node;
30
31        return inorder(node.right);
32    }
33}