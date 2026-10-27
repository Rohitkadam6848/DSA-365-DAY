class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int n=s.length();
        int ans=0;

        int zero=0;
        int one=0;
        

        for(int i=0;i<n;i++){
            

            if(s.charAt(i)=='0'){
                zero++;
                
            }else{
                one++;

                if(i==n-1 || s.charAt(i+1)=='0'){
                    ans=Math.max(ans,2*Math.min(zero,one));
                    
                    zero=0;
                    one=0;
                   
                }
            }

            
        }

        return ans;
    }
}