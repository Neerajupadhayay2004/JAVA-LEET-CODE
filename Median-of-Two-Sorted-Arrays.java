1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        // Ensure nums1 is the smaller array
4        if (nums1.length > nums2.length) {
5            return findMedianSortedArrays(nums2, nums1);
6        }
7
8        int m = nums1.length;
9        int n = nums2.length;
10        int low = 0, high = m;
11
12        while (low <= high) {
13            int cut1 = (low + high) / 2;
14            int cut2 = (m + n + 1) / 2 - cut1;
15
16            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
17            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
18
19            int right1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];
20            int right2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];
21
22            if (left1 <= right2 && left2 <= right1) {
23                // Correct partition
24                if ((m + n) % 2 == 0) {
25                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
26                } else {
27                    return Math.max(left1, left2);
28                }
29            } else if (left1 > right2) {
30                high = cut1 - 1;
31            } else {
32                low = cut1 + 1;
33            }
34        }
35
36        return 0.0; // never reached
37    }
38}
39