package practice.leetcode.problems.p0790dominoandtrominotiling;

public class DominoAndTrominoTiling {
    private static final int MOD = 1_000_000_007;

    public int numTilings(int n) {
        if (n <= 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 5;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        for (int i = 4; i <= n; i++) {
            dp[i] = (int) ((2L * dp[i - 1] + dp[i - 3]) % MOD);
        }
        return dp[n];
    }
}
