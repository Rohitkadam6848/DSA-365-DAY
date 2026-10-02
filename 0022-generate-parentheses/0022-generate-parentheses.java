class Solution {
    public void genratePar(int n,List<String> ans,int openCount,int closingCount,String str){
        if(closingCount==n){
            ans.add(str);
            return;
        }

        if(openCount<n){
            genratePar(n,ans,openCount+1,closingCount,str+"(");
        }

        if(closingCount<openCount){
            genratePar(n,ans,openCount,closingCount+1,str+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        genratePar(n,ans,0,0,"");
        return ans;

    }
}