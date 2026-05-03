1class Solution {
2    public ListNode swapPairs(ListNode head) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5        ListNode prev = dummy;
6
7        while (head != null && head.next != null) {
8            ListNode first = head;
9            ListNode second = head.next;
10
11            // Swapping
12            first.next = second.next;
13            second.next = first;
14            prev.next = second;
15
16            // Move pointers
17            prev = first;
18            head = first.next;
19        }
20
21        return dummy.next;
22    }
23}