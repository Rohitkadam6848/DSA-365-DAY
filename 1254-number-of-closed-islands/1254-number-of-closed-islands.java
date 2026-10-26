class Solution {
    public boolean dfs(int[][] grid,int r,int c){
        int n=grid.length;
        int m=grid[0].length; 

        if(r<0 || c<0 || r>=n || c>=m){
            return true;
        }

        if(grid[r][c]==1){
            return false;
        }

        grid[r][c]=1;

        boolean up=dfs(grid,r-1,c);
        boolean down=dfs(grid,r+1,c);
        boolean left=dfs(grid,r,c-1);
        boolean right=dfs(grid,r,c+1);

        return up || down || left || right;

    } 
    
    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    boolean touchesBondary=dfs(grid,i,j);

                    if(!touchesBondary){
                        ans++;
                    }
                }
            }
        }
        

        return ans;
    }
}