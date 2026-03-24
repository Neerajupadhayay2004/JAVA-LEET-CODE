1class Solution {
2    public int reverse(int x) {
3        int rev = 0;
4
5        while (x != 0) {
6            int digit = x % 10;
7            x /= 10;
8
9            // Check overflow before multiplying
10            if (rev > Integer.MAX_VALUE / 10 || 
11               (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
12                return 0;
13            }
14
15            if (rev < Integer.MIN_VALUE / 10 || 
16               (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
17                return 0;
18            }
19
20            rev = rev * 10 + digit;
21        }
22
23        return rev;
24    }
25}