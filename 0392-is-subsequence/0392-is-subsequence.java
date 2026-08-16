class Solution {
    public boolean isSubsequence(int i,int j,String s, String t,Boolean dp[][]){
        if(i<0)return true;
        if(j<0)return false;

        if(dp[i][j]!=null){
            return dp[i][j];
        }

        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=isSubsequence(i-1,j-1,s,t,dp);
        }

        return dp[i][j]=isSubsequence(i,j-1,s,t,dp);
    }
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        Boolean dp[][]=new Boolean[n][m];

        return  isSubsequence(n-1,m-1,s,t,dp);
        
        
    }
}