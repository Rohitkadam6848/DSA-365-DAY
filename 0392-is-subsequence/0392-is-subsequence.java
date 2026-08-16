class Solution {
    public boolean isSubsequence(int i,int j,String s, String t){
        if(i<0)return true;
        if(j<0)return false;

        if(s.charAt(i)==t.charAt(j)){
            return isSubsequence(i-1,j-1,s,t);
        }

        return isSubsequence(i,j-1,s,t);
    }
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();

        return isSubsequence(n-1,m-1,s,t);

        
    }
}