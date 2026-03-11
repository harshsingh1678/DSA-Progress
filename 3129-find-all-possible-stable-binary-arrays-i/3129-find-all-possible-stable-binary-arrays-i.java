class Solution {

    int MOD = 1000000007;

    public int numberOfStableArrays(int zero, int one, int limit) {
        Long[][][] dp = new Long[zero + 1][one + 1][2];

        long ans = (dfs(zero, one, 0, limit, dp) + dfs(zero, one, 1, limit, dp)) % MOD;
        return (int) ans;
    }

    private long dfs(int z, int o, int last, int limit, Long[][][] dp) {

        if (z < 0 || o < 0) return 0;
        if (z == 0 && o == 0) return 1;

        if (dp[z][o][last] != null) return dp[z][o][last];

        long ans = 0;

        if (last == 0) {
            for (int i = 1; i <= limit && i <= z; i++) {
                ans = (ans + dfs(z - i, o, 1, limit, dp)) % MOD;
            }
        } 
        else {
            for (int i = 1; i <= limit && i <= o; i++) {
                ans = (ans + dfs(z, o - i, 0, limit, dp)) % MOD;
            }
        }

        return dp[z][o][last] = ans;
    }
}