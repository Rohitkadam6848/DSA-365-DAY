class Pair{
    int row;
    int col;
    
    public Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}

class Solution {
    public long bfs(int[][] grid, boolean[][] vis, int row, int col) { 
        int n=grid.length;
        int m=grid[0].length;

        vis[row][col]=true;
        long val = grid[row][col];

        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(row,col));

        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};

        while(!q.isEmpty()){
            Pair curr=q.poll();
            int r=curr.row;
            int c=curr.col;

            for(int i=0;i<4;i++){
                int nrow=r+delRow[i];
                int ncol=c+delCol[i];

                if(nrow>=0 && nrow<n &&
                   ncol>=0 && ncol<m &&
                   grid[nrow][ncol]!=0 &&
                   vis[nrow][ncol]==false)
                {
                    vis[nrow][ncol]=true;
                    q.offer(new Pair(nrow,ncol));
                    val+=grid[nrow][ncol];
                }
            }


        }

        return val;


    }

    public int countIslands(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]!=0){
                    long val=bfs(grid,vis,i,j);

                    if(val%k==0){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}