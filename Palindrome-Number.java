1class Solution {
2    public boolean isPalindrome(int x) {
3        // Negative numbers or numbers ending with 0 (except 0) are not palindromes
4        if (x < 0 || (x % 10 == 0 && x != 0)) {
5            return false;
6        }
7
8        int reversedHalf = 0;
9
10        while (x > reversedHalf) {
11            int digit = x % 10;
12            reversedHalf = reversedHalf * 10 + digit;
13            x /= 10;
14        }
15
16        // For even length: x == reversedHalf
17        // For odd length: x == reversedHalf / 10
18        return x == reversedHalf || x == reversedHalf / 10;
19    }
20}
21