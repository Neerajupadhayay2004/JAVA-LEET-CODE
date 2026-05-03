1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode prevGroup = dummy;
7
8        while (true) {
9            // Step 1: Find kth node
10            ListNode kth = getKth(prevGroup, k);
11            if (kth == null) break;
12
13            ListNode nextGroup = kth.next;
14
15            // Step 2: Reverse group
16            ListNode prev = nextGroup;
17            ListNode curr = prevGroup.next;
18
19            while (curr != nextGroup) {
20                ListNode temp = curr.next;
21                curr.next = prev;
22                prev = curr;
23                curr = temp;
24            }
25
26            // Step 3: Reconnect
27            ListNode temp = prevGroup.next;
28            prevGroup.next = kth;
29            prevGroup = temp;
30        }
31
32        return dummy.next;
33    }
34
35    private ListNode getKth(ListNode curr, int k) {
36        while (curr != null && k > 0) {
37            curr = curr.next;
38            k--;
39        }
40        return curr;
41    }
42}