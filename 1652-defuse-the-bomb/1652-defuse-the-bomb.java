class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        if(k == 0){
            for(int i=0;i<n;i++){
                ans[i] = 0;
            }
        }
        else if(k > 0){
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n]; // Wraps forward automatically
                }
                ans[i] = sum;
            }
        }else{
            int absK = Math.abs(k); // or -k
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= absK; j++) {
                    sum += code[(i - j + n) % n]; // Wraps backward automatically
                }
                ans[i] = sum;
            }
        }
        return ans;
    }
}