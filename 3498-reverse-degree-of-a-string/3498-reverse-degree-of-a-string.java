class Solution {
    public int reverseDegree(String s) {

        int ans = 0;

        int degree[] = new int[26];
        int a = 26;

        for (int i = 0; i < degree.length; i++) {
            degree[i] = a;
            a--;
        }

        for (int i = 0; i < s.length(); i++) {
            int val = degree[s.charAt(i) - 'a'] * (i + 1);
            ans += val;
        }

        return ans;
    }
}