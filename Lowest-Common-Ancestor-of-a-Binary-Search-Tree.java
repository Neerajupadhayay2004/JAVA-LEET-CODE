1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        
14        if (root == null) return null;
15
16        if (p.val < root.val && q.val < root.val) {
17            return lowestCommonAncestor(root.left, p, q);
18        }
19        
20        if (p.val > root.val && q.val > root.val) {
21            return lowestCommonAncestor(root.right, p, q);
22        }
23        
24        return root; // split point
25    }
26}