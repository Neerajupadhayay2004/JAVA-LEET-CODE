1class Solution {
2    public ListNode oddEvenList(ListNode head) {
3        
4        if (head == null || head.next == null) {
5            return head;
6        }
7        
8        ListNode odd = head;
9        ListNode even = head.next;
10        ListNode evenHead = even;
11        
12        while (even != null && even.next != null) {
13            
14            odd.next = even.next;
15            odd = odd.next;
16            
17            even.next = odd.next;
18            even = even.next;
19        }
20        
21        odd.next = evenHead;
22        
23        return head;
24    }
25}