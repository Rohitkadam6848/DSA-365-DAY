class Solution {

    public boolean helper(char[][] grid, int i, int j, int bal, boolean vis[][][], int n, int m){

        if(grid[i][j]=='('){
            bal++;
        }else{
            bal--;
        }

        if(bal<0){
            return false;
        }


        if(i==n-1 && j==m-1){
            return bal==0;
        }

        if(vis[i][j][bal]){
            return false;
        }

        vis[i][j][bal]=true;

        if(i+1<n && helper(grid,i+1,j,bal,vis,n,m)){
            return true;
        }

        if(j+1<m && helper(grid,i,j+1,bal,vis,n,m)){
            return true;
        }

        return false;

    }
    
    public boolean hasValidPath(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        if((n+m-1)%2 !=0){
            return false;
        }

        if(grid[0][0]==')'){
            return false;
        }


        boolean vis[][][]=new boolean[n][m][n+m+1];
        return helper(grid,0,0,0,vis,n,m);
        
    }
}