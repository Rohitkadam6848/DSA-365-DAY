class Solution {

    static final int MOD = 1_000_000_007;
    long[] fact;
    long[] invFact;

    public int countValidSequences(int n, int k) { 
        fact =new long[n+1];
        invFact =new long[n+1];

        fact[0]=1;
        for (int i=1;i<=n;i++){
            fact[i]=(fact[i-1]*i)%MOD;
        }

        invFact[n] = power(fact[n], MOD - 2);
        for (int i=n-1;i>=0;i--) {
            invFact[i]=(invFact[i + 1]*(i + 1)%MOD);
        }

        long total=nCr(n-1,k-1);
        long allOdd=0;

        if ((n-k)%2==0) {
            int m=(n-k)/2;
            allOdd=nCr(m+k-1,k-1);
        }

        long ans = (total - allOdd + MOD) % MOD;
        return (int) ans;
    }

    private long nCr(int n, int r) {
        if (r<0 || r> n) return 0;
        return (((fact[n] * invFact[r]) % MOD) * invFact[n - r]) % MOD;
    }

    private long power(long a, long b) {
        long res = 1;

        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % MOD;

            a = (a * a) % MOD;
            b >>= 1;
        }

        return res;
    }
}