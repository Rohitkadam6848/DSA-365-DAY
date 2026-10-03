class Solution {
    public int numWays(String s) {

        int n = s.length();
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            total += ch - '0';
        }

        if (total % 3 != 0) {
            return 0;
        }

        if (total == 0) {
            long ways = (long)(n - 1) * (n - 2) / 2;
            return (int)(ways % 1000000007);
        }

        int onePart = total / 3;

        int ones = 0;
        long ways1 = 0;
        long ways2 = 0;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == '1') {
                ones++;
            }

            if (ones == onePart) {
                ways1++;
            }

            if (ones == 2 * onePart) {
                ways2++;
            }
        }

        return (int)((ways1 * ways2) % 1000000007);
    }
}