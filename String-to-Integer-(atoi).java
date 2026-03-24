1class Solution {
2    public int myAtoi(String s) {
3        int i = 0, n = s.length();
4        int sign = 1;
5        int result = 0;
6
7        // 1. Skip leading whitespace
8        while (i < n && s.charAt(i) == ' ') {
9            i++;
10        }
11
12        // 2. Handle sign
13        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
14            sign = (s.charAt(i) == '-') ? -1 : 1;
15            i++;
16        }
17
18        // 3. Convert digits
19        while (i < n && Character.isDigit(s.charAt(i))) {
20            int digit = s.charAt(i) - '0';
21
22            // 4. Overflow check
23            if (result > Integer.MAX_VALUE / 10 ||
24               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
25                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
26            }
27
28            result = result * 10 + digit;
29            i++;
30        }
31
32        return result * sign;
33    }
34}
35