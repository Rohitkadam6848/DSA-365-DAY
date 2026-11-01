class Solution {

    public boolean allEqual(String s) {
        int n = s.length();

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                return false;
            }
        }

        return true;
    }

    public boolean hasSameDigits(String s) {

        while (s.length() > 2) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length() - 1; i++) {

                int digit = ((s.charAt(i) - '0') +(s.charAt(i + 1) - '0')) % 10;

                sb.append(digit);
            }

            s = sb.toString();
        }

        return allEqual(s);
    }
}