1import java.util.Arrays;
2
3class Solution {
4    public int threeSumClosest(int[] nums, int target) {
5        
6        Arrays.sort(nums);  // Step 1: Sort array
7        
8        int n = nums.length;
9        int closestSum = nums[0] + nums[1] + nums[2];  // Initial sum
10        
11        for(int i = 0; i < n - 2; i++) {
12            
13            int left = i + 1;
14            int right = n - 1;
15            
16            while(left < right) {
17                
18                int currentSum = nums[i] + nums[left] + nums[right];
19                
20                // Update closest sum if needed
21                if(Math.abs(currentSum - target) < 
22                   Math.abs(closestSum - target)) {
23                    closestSum = currentSum;
24                }
25                
26                // Move pointers
27                if(currentSum < target) {
28                    left++;
29                } 
30                else if(currentSum > target) {
31                    right--;
32                } 
33                else {
34                    return currentSum;  // Exact match
35                }
36            }
37        }
38        
39        return closestSum;
40    }
41}