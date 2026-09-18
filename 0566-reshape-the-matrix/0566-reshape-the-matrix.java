class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;

        if(n*m!=r*c){
            return mat;
        }


        int[][] ans=new int[r][c];
        int index=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){

                int orgRow=index/m;
                int orgCol=index%m;

                ans[i][j]=mat[orgRow][orgCol];
                
                index++;
                    
            }
                
        }
        

        return ans;
    }
}