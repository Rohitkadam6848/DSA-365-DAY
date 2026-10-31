class Solution {
    int dp[][][];
    long mod=(int)1e9+7;

    public int helper(int[][] grid,int i,int j,int k){
        int n=grid.length;
        int m=grid[0].length;
          
        if(i>=n || j>=m){
            return 0;
        }

        if(i==n-1 && j==m-1){
            return 1;
        }

      

        if(dp[i][j][k]!=-1){
            return dp[i][j][k];
        }

        if(grid[i][j]==1){
            if(k==0){
                return dp[i][j][k]=helper(grid, i + 1, j, 1);
            }else{
                return dp[i][j][k]=helper(grid, i, j+1, 0);
            }
        }

        int down = helper(grid, i + 1, j, 1);
        int right = helper(grid, i, j + 1, 0);

        return dp[i][j][k] = (int)((down + (long)right) % mod);
    }
    public int uniquePaths(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        dp=new int[n][m][2];

        for(int [][] k:dp){
            for(int [] l:k){
                Arrays.fill(l,-1);
            }
        }

        return helper(grid,0,0,0);
    }
}