1class Solution {
2    public int subsetXORSum(int[] nums) {
3        return findSubsets(new ArrayList<>(), nums, 0, 0);
4    }
5
6    private int findSubsets(List<Integer> tempList, int[] nums, int idx, int xorSum) {
7
8        if (idx == nums.length) {
9            int xor = 0;
10            for (int num : tempList) {
11                xor ^= num;
12            }
13            return xor;
14        }
15
16        // include
17        tempList.add(nums[idx]);
18        int include = findSubsets(tempList, nums, idx + 1, xorSum);
19
20        // backtrack
21        tempList.remove(tempList.size() - 1);
22
23        // exclude
24        int exclude = findSubsets(tempList, nums, idx + 1, xorSum);
25
26        return include + exclude;
27    }
28}