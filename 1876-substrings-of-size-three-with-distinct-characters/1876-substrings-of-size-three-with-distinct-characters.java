class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        int n=s.length();
        int j=0;

        for(int i=0;i<n;i++){
            if(i-j+1==3){
                if(s.charAt(j)!=s.charAt(j+1) &&
                   s.charAt(j+1) != s.charAt(j+2) &&
                   s.charAt(j) != s.charAt(j+2))
                {
                    count++;
                }
                j++;
            }
        }
        return count;
    }
}