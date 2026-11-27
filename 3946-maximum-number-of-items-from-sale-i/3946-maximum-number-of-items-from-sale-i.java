class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        int free[]=new int[n];

        int minPrice=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            minPrice=Math.min(minPrice,items[i][1]);

            for(int j=0;j<n;j++){
                if(i!=j && items[j][0] % items[i][0]==0 ){
                 free[i]++;   
                }
            }
        }


        int dp[]=new int[budget+1];

        for(int i=0;i<n;i++){
            int price=items[i][1];
            int benifit=1+free[i];


            for(int j=budget ; j>=price ; j--){
                dp[j]=Math.max(dp[j], dp[j-price]+benifit);
            }
        }

        int ans=0;

        for(int i=0;i<=budget;i++){
            int remaining = budget - i;
            int extra = remaining / minPrice;

            ans = Math.max(ans, dp[i] + extra);
        }

        return ans;
    }
}