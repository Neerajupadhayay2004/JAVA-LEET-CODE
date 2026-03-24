1class Solution {
2    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
3        ListNode dummy = new ListNode(0);
4        ListNode current = dummy;
5        int carry = 0;
6
7        while (l1 != null || l2 != null || carry != 0) {
8            int sum = carry;
9
10            if (l1 != null) {
11                sum += l1.val;
12                l1 = l1.next;
13            }
14
15            if (l2 != null) {
16                sum += l2.val;
17                l2 = l2.next;
18            }
19
20            carry = sum / 10;
21            current.next = new ListNode(sum % 10);
22            current = current.next;
23        }
24
25        return dummy.next;
26    }
27}
28