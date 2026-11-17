class Solution {
    int drow[]={-1,0,1,0};
    int dcol[]={0,1,0,-1};

    public int dfs(int[][] grid, int vis[][],int i,int j){
        vis[i][j]=1;
        int area=1;

        int n=grid.length;
        int m=grid[0].length;

        for(int c=0;c<4;c++){
            int nrow=i+drow[c];
            int ncol=j+dcol[c];

            if(nrow>=0 && nrow<n &&
                ncol>=0 && ncol<m &&
                vis[nrow][ncol]!=1 &&
                grid[nrow][ncol]==1
            ){
                area+=dfs(grid,vis,nrow,ncol);
            }
        }

        return area;
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;

        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];

       


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int Area=0;
                if(vis[i][j]!=1 && grid[i][j]==1){
                   int area=dfs(grid,vis,i,j);
                   maxArea=Math.max(maxArea,area);
                }
                
            }
        }

        return maxArea;
    }
}