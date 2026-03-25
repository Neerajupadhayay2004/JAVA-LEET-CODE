1import java.util.*;
2
3class Solution {
4    public ListNode mergeKLists(ListNode[] lists) {
5        
6        PriorityQueue<ListNode> pq = new PriorityQueue<>(
7            (a, b) -> a.val - b.val
8        );
9
10        // Add first nodes
11        for (ListNode node : lists) {
12            if (node != null) {
13                pq.add(node);
14            }
15        }
16
17        ListNode dummy = new ListNode(0);
18        ListNode current = dummy;
19
20        // Merge
21        while (!pq.isEmpty()) {
22            ListNode minNode = pq.poll();
23            current.next = minNode;
24            current = current.next;
25
26            if (minNode.next != null) {
27                pq.add(minNode.next);
28            }
29        }
30
31        return dummy.next;
32    }
33}