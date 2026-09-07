class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1_000_000_007;

        int[] last = new int[26];

        long dp = 1; 

        for (char ch : s.toCharArray()) {

            int idx = ch - 'a';

            long newDp = (2 * dp - last[idx] + MOD) % MOD;

            last[idx] = (int) dp;

            dp = newDp;
        }

        return (int) (dp - 1 + MOD) % MOD;
    }
}