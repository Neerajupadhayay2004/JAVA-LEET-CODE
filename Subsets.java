1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        int n = nums.length;
5        int total = 1 << n; // 2^n
6
7        for (int mask = 0; mask < total; mask++) {
8            List<Integer> subset = new ArrayList<>();
9
10            for (int i = 0; i < n; i++) {
11                if ((mask & (1 << i)) != 0) {
12                    subset.add(nums[i]);
13                }
14            }
15
16            result.add(subset);
17        }
18
19        return result;
20    }
21}