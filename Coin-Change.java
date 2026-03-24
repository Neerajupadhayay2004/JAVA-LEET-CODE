1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        
4        int[] dp = new int[amount + 1];
5        
6       
7        Arrays.fill(dp, amount + 1);
8        
9    
10        dp[0] = 0;
11        
12        
13        for (int i = 1; i <= amount; i++) {
14            
15            for (int coin : coins) {
16                if (coin <= i) {
17                  
18                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
19                }
20            }
21        }
22        
23        // If dp[amount] is still amount + 1, it means we couldn't make the amount
24        return dp[amount] > amount ? -1 : dp[amount];
25    }
26}