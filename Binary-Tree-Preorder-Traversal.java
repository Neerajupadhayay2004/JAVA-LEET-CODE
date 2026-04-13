1class Solution {
2    public List<Integer> preorderTraversal(TreeNode root) {
3        List<Integer> result = new ArrayList<>();
4        dfs(root, result);
5        return result;
6    }
7
8    private void dfs(TreeNode node, List<Integer> result) {
9        if (node == null) return;
10        result.add(node.val);      // Root
11        dfs(node.left, result);    // Left
12        dfs(node.right, result);   // Right
13    }
14}