1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        List<List<Integer>> list = new ArrayList<>();
4        Arrays.sort(nums); // 🔥 important
5        findSubsets(new ArrayList<>(), nums, 0, list);
6        return list;
7    }
8
9    private void  findSubsets(List<Integer> tempList, int[] nums, int idx, List<List<Integer>> ans) {
10        
11        if (idx == nums.length) {
12            ans.add(new ArrayList<>(tempList));
13            return;
14        }
15
16        // ✅ take
17        tempList.add(nums[idx]);
18        findSubsets(tempList, nums, idx + 1, ans);
19        tempList.remove(tempList.size() - 1); 
20        
21        int next = idx + 1;
22        while (next < nums.length && nums[next] == nums[idx]) {
23            next++;
24        }
25
26        findSubsets(tempList, nums, next, ans);
27    }
28}