class Solution {
    public int longestValidParentheses(String s) {
        
        int n=s.length();
        int st[]=new int[n+1];
        int top=-1;
        int ans=0;
        st[++top]=-1;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                top++;
                st[top]=i;
            }else{
                top--;

                if(top==-1){
                    top++;
                    st[top]=i;
                }else{
                    ans=Math.max(ans,i-st[top]);
                }
                
            }

        }
        return ans;
    }
}