class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int n=s.length();
        int ans=Integer.MIN_VALUE;

        int zero=0;
        int one=0;
        
        int i=0;

        while(i<n){
            while(i<n && s.charAt(i)=='0'){
                zero++;
                i++;
            }

            while(i<n && s.charAt(i)=='1'){
                one++;
                i++;
            }

            ans=Math.max(ans,2*Math.min(zero,one));
            zero=0;
            one=0;


        }
        return ans;
    }
}