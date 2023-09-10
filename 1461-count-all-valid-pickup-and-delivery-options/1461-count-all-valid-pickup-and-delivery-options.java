public class Solution {
    private static final int MOD = 1000000007;

    public int countOrders(int n) {
        long answer = 1;
        for (int i = 2; i <= n; i++) {
            answer = (answer * (2 * i - 1) * i) % MOD;
        }
        return (int) answer;
    }
}