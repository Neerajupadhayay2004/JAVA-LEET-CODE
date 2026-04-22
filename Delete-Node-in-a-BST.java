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
17    public TreeNode deleteNode(TreeNode root, int key) {
18        if (root == null) {
19            return null;
20        }
21        
22        if (key < root.val) {
23            root.left = deleteNode(root.left, key);
24        } else if (key > root.val) {
25            root.right = deleteNode(root.right, key);
26        } else {
27            if (root.left == null && root.right == null) {
28                return null;
29            }
30            
31            if (root.left == null) {
32                return root.right;
33            }
34            if (root.right == null) {
35                return root.left;
36            }
37            TreeNode successor = findMin(root.right);
38            root.val = successor.val;
39            root.right = deleteNode(root.right, successor.val);
40        }
41        
42        return root;
43    }
44    
45    private TreeNode findMin(TreeNode node) {
46        while (node.left != null) {
47            node = node.left;
48        }
49        return node;
50    }
51}